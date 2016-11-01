package fik.sample.android.samplevectordrawable;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.graphics.drawable.VectorDrawableCompat;
import android.support.v4.content.ContextCompat;
import android.support.v4.graphics.drawable.DrawableCompat;

/**
 * Created by Mochamad Taufik on 01-Nov-16.
 * Email   : thidayat13@gmail.com
 * Company : TRUSTUDIO
 */

public class VectorUtil {

    public static Drawable getTintVectorDrawable(Context context, int draw, int color) {

        Drawable d = VectorDrawableCompat.create(context.getResources(), draw, null);
        d = DrawableCompat.wrap(d);
        DrawableCompat.setTint(d, ContextCompat.getColor(context, color));

        return d;
    }

    public static Drawable getVectorDrawable(Context context, int draw) {

        Drawable d = VectorDrawableCompat.create(context.getResources(), draw, null);
        d = DrawableCompat.wrap(d);
        return d;
    }
}
