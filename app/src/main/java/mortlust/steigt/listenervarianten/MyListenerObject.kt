package mortlust.steigt.listenervarianten

import android.view.View
import android.widget.Button

object MyListenerObject: View.OnClickListener {
    /*
     * 11.4.3 own class
     */
    override fun onClick(v: View?) {
        val bu = v as Button
        //bu.text = "four"
        bu.text = v.context.getString(R.string.buOutputFour)
    }

}