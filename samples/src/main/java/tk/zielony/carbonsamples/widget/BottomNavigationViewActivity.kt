package tk.zielony.carbonsamples.widget

import android.os.Bundle
import carbon.drawable.DefaultIconColorAccentStateList
import carbon.widget.BottomNavigationView
import kotlinx.android.synthetic.main.activity_bottomnavigationview.*
import tk.zielony.carbonsamples.ActivityAnnotation
import tk.zielony.carbonsamples.R
import tk.zielony.carbonsamples.ThemedActivity

@ActivityAnnotation(layout = R.layout.activity_bottomnavigationview, title = R.string.bottomNavigationViewActivity_title)
class BottomNavigationViewActivity : ThemedActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        initToolbar()

        bottomBar3.menuItems = arrayOf(
                BottomNavigationView.Item().apply {
                    icon = resources.getDrawable(R.drawable.ic_android_black_24dp)
                    title = "Android"
                    iconTintList = DefaultIconColorAccentStateList(this@BottomNavigationViewActivity)
                },
                BottomNavigationView.Item().apply {
                    icon = resources.getDrawable(R.drawable.ic_calendar_black_24dp)
                    title = "Calendar"
                    iconTintList = DefaultIconColorAccentStateList(this@BottomNavigationViewActivity)
                },
                BottomNavigationView.Item().apply {
                    icon = resources.getDrawable(R.drawable.ic_comment_black_24dp)
                    title = "Comment"
                    iconTintList = DefaultIconColorAccentStateList(this@BottomNavigationViewActivity)
                })
    }
}