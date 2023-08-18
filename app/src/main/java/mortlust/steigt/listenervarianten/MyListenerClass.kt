package mortlust.steigt.listenervarianten

import android.view.View
import android.widget.Button

class MyListenerClass: View.OnClickListener {
    override fun onClick(v: View?) {
        val bu = v as Button
        /*  Accessing resources without 'context'
         *  For system resources only!
         */
        //bu.text = Resources.getSystem().getString(R.string.tvOutputBuThree)
        bu.text = "drei"
    }
}