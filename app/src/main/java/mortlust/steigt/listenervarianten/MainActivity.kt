package mortlust.steigt.listenervarianten

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import mortlust.steigt.listenervarianten.databinding.ActivityMainBinding
//import android.view.LayoutInflater
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var B: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        B = ActivityMainBinding.inflate(layoutInflater)
        setContentView(B.root)

        /*
         * 11.4.1 current activity-object 1/2
         */
        B.buOne.setOnClickListener(this)
        B.buTwo.setOnClickListener(this)

        /*
         * 11.4.3 own class 1/2
         * class MyListenerClass
         */
        val mDrei = MyListenerClass()
        B.buThree.setOnClickListener(mDrei)

        /*
         * 11.4.4 named listener object 1/2
         * MyListenerObject
         */
        B.buFour.setOnClickListener(MyListenerObject)

        /*
         * 11.4.5 anonymous singleton-object with reference
         *
         * val mFive = object: View.OnClickListener {
         *     override fun onClick(v: View?) {
         *         B.tvOutput.text = getString(R.string.buFiveName)
         *     }
         * }
         *
         * converted to lambda expression
         */
        //val mFive = View.OnClickListener { B.tvOutput.text = "5" }
        val mFive = View.OnClickListener { B.tvOutput.text = getString(R.string.buFiveName) }
        B.buFive.setOnClickListener(mFive)

        /*
         * 11.4.6 anonymous singleton-object without reference
         *
         * B.buSix.setOnClickListener(object: View.OnClickListener {
         *     override fun onClick(v: View?) {
         *         B.tvOutput.text = getString(R.string.buSixName)
         *     }
         * })
         * converted to lambda expression
         */
        B.buSix.setOnClickListener { B.tvOutput.text = getString(R.string.buSixName) }

        /*
         * 11.4.7 Anonymous function
         */
        B.buSeven.setOnClickListener { v ->
            val bu = v as Button
            bu.text = getString(R.string.buOutputSeven)
        }

        /*
         * 11.4.8 not used parameter
         * _ can be used instead of a name if a parameter from an anonymous function isn't used
         */
        B.buEight.setOnClickListener { _ ->
            B.tvOutput.text = getString(R.string.buEightName)
        }

        /*
         * 11.4.9 the parameter "it"
         * in case an anonymous function only have a single parameter there is no need for [operator ->]
         * the parameter is accessible via the key word "it"
         */
        B.buNine.setOnClickListener {
            val bu = it as Button
            bu.text = getString(R.string.buOutputnine)
        }

        /*
         * 11.4.10 The compact variant
         */
        B.buTen.setOnClickListener {
            B.tvOutput.text = getString(R.string.buTenName)
        }

    }

    /*
     * 11.4.1 current activity-object 2/2
     */
    override fun onClick(v: View?) {
        when (v?.id) {
            B.buOne.id -> B.tvOutput.text = getString(R.string.buOneName)
            B.buTwo.id -> B.tvOutput.text = getString(R.string.buTwoName)
        }
    }

}