package com.akbaranjas.app.mypremierleague.utils.svgdecoder;

import android.content.Context;
import android.graphics.drawable.PictureDrawable;
import android.net.Uri;
import com.bumptech.glide.GenericRequestBuilder;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.model.StreamEncoder;
import com.bumptech.glide.load.resource.file.FileToStreamDecoder;
import com.caverock.androidsvg.SVG;

import java.io.InputStream;


/**
 * Created by Asus A450C on 25/05/2017.
 */
public class GRequestBuilder {

    private static GenericRequestBuilder<Uri, InputStream, SVG, PictureDrawable> requestBuilder = null;

    public static GenericRequestBuilder<Uri, InputStream, SVG, PictureDrawable> getRequestBuilder(Context context) {
        if (requestBuilder==null) {
            requestBuilder = Glide.with(context)
                    .using(Glide.buildStreamModelLoader(Uri.class, context), InputStream.class)
                    .from(Uri.class)
                    .as(SVG.class)
                    .transcode(new SvgDrawableTranscoder(), PictureDrawable.class)
                    .sourceEncoder(new StreamEncoder())
                    .cacheDecoder(new FileToStreamDecoder<SVG>(new SvgDecoder()))
                    .decoder(new SvgDecoder())
                    .animate(android.R.anim.fade_in)
                    .listener(new SvgSoftwareLayerSetter<Uri>());
        }
        return requestBuilder;
    }

}
