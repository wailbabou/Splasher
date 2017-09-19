package wail.splacher.com.splasherexample;

import android.graphics.Color;
import android.graphics.Typeface;
import android.widget.Toast;

import com.daimajia.androidanimations.library.Techniques;

import wail.splacher.com.splasher.lib.SplasherActivity;
import wail.splacher.com.splasher.models.SplasherConfig;
import wail.splacher.com.splasher.utils.Const;

public class MainActivity extends SplasherActivity {

    @Override
    public void initSplasher(SplasherConfig config) {
        config.setReveal_start(Const.START_TOP_LEFT)
                //---------------
                .setAnimationDuration(5000)
                //---------------
                .setLogo(R.drawable.web_hi_res_512)
                .setLogo_animation(Techniques.BounceIn)
                .setAnimationLogoDuration(2000)
                .setLogoWidth(500)
                //---------------
                .setTitle("Splasher Example")
                .setTitleColor(Color.parseColor("#ffffff"))
                .setTitleAnimation(Techniques.Bounce)
                .setTitleSize(24)
                //---------------
                .setSubtitle("Enjoy with this library")
                .setSubtitleColor(Color.parseColor("#ffffff"))
                .setSubtitleAnimation(Techniques.FadeIn)
                .setSubtitleSize(16)
                //---------------
                .setSubtitleTypeFace(Typeface.createFromAsset(getAssets(),"diana.otf"))
                .setTitleTypeFace(Typeface.createFromAsset(getAssets(),"stc.otf"));

       //Example of custom view ..
       /* config.setCustomView(R.layout.custom_view)
                .setReveal_start(Const.START_CENTER)
                .setAnimationDuration(5000);
        getCustomView().findViewById(R.id.textView)*/

    }

    @Override
    public void onSplasherFinished() {
        Toast.makeText(this, "Go to the next activity", Toast.LENGTH_SHORT).show();
    }
}
