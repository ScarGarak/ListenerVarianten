package mortlust.steigt.listenervarianten

import android.view.View
import android.widget.Button

class MyListenerClass: View.OnClickListener {
    /*
     * 11.4.3 own class
     */
    override fun onClick(v: View?) {
        val bu = v as Button
        /*  Accessing string resources with 'context'
         *  For system resources only!
         */
        bu.text = v.context.getString(R.string.buOutputThree)
        //bu.text = "drei"
    }
}