package com.example.camera.utils.imageload;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.support.design.widget.CoordinatorLayout;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.request.animation.GlideAnimation;
import com.bumptech.glide.request.target.SimpleTarget;
import com.bumptech.glide.signature.StringSignature;

import java.io.File;

/**
 * 网络图片的工具类
 * <p>
 * (1)ImageView设置图片（错误图片）
 * （2）ImageView设置图片---BitMap(不设置默认图)
 * （3）设置RelativeLayout
 * （4）设置LinearLayout
 * （5）设置FrameLayout
 * （6）高斯模糊------ RelativeLayout
 * （7）高斯模糊------ LinearLayout
 * （8）圆角显示图片  ImageView
 *
 * @author huangshuyuan
 */
public class ShowImageUtils {

    public static void clearMemory(Context context) {
        Glide.get(context.getApplicationContext()).clearMemory();
    }

    public static void clearDiskCache(Context context) {
        Glide.get(context.getApplicationContext()).clearDiskCache();
    }

    public static void onLowMemory(Context context) {
        Glide.with(context).onLowMemory();
    }

    public static void pauseRequests(Activity activity) {
        if (!Glide.with(activity).isPaused())
            Glide.with(activity).pauseRequests();
    }

    public static void resumeRequests(Activity activity) {
        if (Glide.with(activity).isPaused())
            Glide.with(activity).resumeRequests();
    }

    public static void showImageView(Context context,
                                     Object res, int errorimg, ImageView imgeview) {
        if (null == res) return;
        if (res instanceof String) {
            showImageView(context, (String) res, errorimg, imgeview);
        } else if (res instanceof Integer) {
            showImageView(context, (int) res, errorimg, imgeview);
        } else if (res instanceof File) {
            showImageView(context, (File) res, errorimg, imgeview);
        }
    }


    /**
     * (1)
     * 显示图片Imageview
     *
     * @param context  上下文
     * @param errorimg 错误的资源图片
     * @param url      图片链接
     * @param imgeview 组件
     */
    public static void showImageView(Context context,
                                     String url, int errorimg, ImageView imgeview) {
        Glide.with(context).load(url)// 加载图片
                .error(errorimg)// 设置错误图片
                .crossFade()// 设置淡入淡出效果，默认300ms，可以传参
                .placeholder(errorimg)// 设置占位图
                .diskCacheStrategy(DiskCacheStrategy.RESULT)// 缓存修改过的图片
                .into(imgeview);
        // Glide.with(context).load(url).thumbnail(0.1f).error(errorimg)
        // .into(imgeview);

        // Glide
        // .with(context)
        // .load(UsageExampleListViewAdapter.eatFoodyImages[0])
        // .placeholder(R.mipmap.ic_launcher) //设置占位图
        // .error(R.mipmap.future_studio_launcher) //设置错误图片
        // .crossFade() //设置淡入淡出效果，默认300ms，可以传参
        // //.dontAnimate() //不显示动画效果
        // .into(imageViewFade);
    }

    public static void showImageView(Context context,
                                     int resId, int errorimg, ImageView imgeview) {
        Glide.with(context).load(resId)// 加载图片
                .error(errorimg)// 设置错误图片
                .crossFade()// 设置淡入淡出效果，默认300ms，可以传参
                .placeholder(errorimg)// 设置占位图
                .diskCacheStrategy(DiskCacheStrategy.RESULT)// 缓存修改过的图片
                .into(imgeview);
    }

    public static void showImageView(Context context,
                                     File file, int errorimg, ImageView imgeview) {
        Glide.with(context).load(file)// 加载图片
                .error(errorimg)// 设置错误图片
                .crossFade()// 设置淡入淡出效果，默认300ms，可以传参
                .placeholder(errorimg)// 设置占位图
                .diskCacheStrategy(DiskCacheStrategy.RESULT)// 缓存修改过的图片
                .into(imgeview);
    }

    /**
     * （8）
     * 显示图片 圆形显示  ImageView
     *
     * @param context  上下文
     * @param errorimg 错误的资源图片
     * @param url      图片链接/uri
     * @param imgeview 组件
     */
    public static void showImageViewToCircle(Context context,
                                             String url, int errorimg, ImageView imgeview) {
        Glide.with(context).load(url)
                // 加载图片
                .error(errorimg)
                // 设置错误图片
                .crossFade()
                // 设置淡入淡出效果，默认300ms，可以传参
                .placeholder(errorimg)
                // 设置占位图
                .transform(new GlideCircleTransform(context))//圆形显示
                .diskCacheStrategy(DiskCacheStrategy.RESULT)// 缓存修改过的图片
                .into(imgeview);
    }

    /**
     * 不带缓存（即使同一地址，每次也会展示最新图片）
     */
    public static void showImageViewToCircleWithoutCache(Context context,
                                                         String url, int errorimg, ImageView imgeview) {
        Glide.with(context).load(url)
                .signature(new StringSignature(String.valueOf(System.currentTimeMillis())))
                // 加载图片
                .error(errorimg)
                // 设置错误图片
                .crossFade()
                // 设置淡入淡出效果，默认300ms，可以传参
                .placeholder(errorimg)
                // 设置占位图
                .transform(new GlideCircleTransform(context))//圆形显示
                .diskCacheStrategy(DiskCacheStrategy.RESULT)// 缓存修改过的图片
                .into(imgeview);
    }

    public static void showImageViewToCircle(Context context,
                                             int resId, int errorimg, ImageView imgeview) {
        Glide.with(context).load(resId)
                // 加载图片
                .error(errorimg)
                // 设置错误图片
                .crossFade()
                // 设置淡入淡出效果，默认300ms，可以传参
                .placeholder(errorimg)
                // 设置占位图
                .transform(new GlideCircleTransform(context))//圆形显示
                .diskCacheStrategy(DiskCacheStrategy.RESULT)// 缓存修改过的图片
                .into(imgeview);
    }

    public static void showImageViewToCircle(Context context,
                                             File file, int errorimg, ImageView imgeview) {
        Glide.with(context).load(file)
                // 加载图片
                .error(errorimg)
                // 设置错误图片
                .crossFade()
                // 设置淡入淡出效果，默认300ms，可以传参
                .placeholder(errorimg)
                // 设置占位图
                .transform(new GlideCircleTransform(context))//圆形显示
                .diskCacheStrategy(DiskCacheStrategy.RESULT)// 缓存修改过的图片
                .into(imgeview);
    }

    /**
     * （8）
     * 显示图片 圆角显示  ImageView
     *
     * @param context  上下文
     * @param errorimg 错误的资源图片
     * @param url      图片链接/uri
     * @param radius   圆角角度
     * @param imgeview 组件
     */
    public static void showImageViewToRound(Context context,
                                            String url, int errorimg, int radius, ImageView imgeview) {
        Glide.with(context).load(url)
                // 加载图片
                .error(errorimg)
                // 设置错误图片
                .crossFade()
                // 设置淡入淡出效果，默认300ms，可以传参
                .placeholder(errorimg)
                // 设置占位图
                .transform(new GlideRoundTransform(context, radius))//圆角显示
                .diskCacheStrategy(DiskCacheStrategy.RESULT)// 缓存修改过的图片
                .into(imgeview);
    }

    public static void showImageViewToRound(Context context,
                                            int resId, int errorimg, int radius, ImageView imgeview) {
        Glide.with(context).load(resId)
                // 加载图片
                .error(errorimg)
                // 设置错误图片
                .crossFade()
                // 设置淡入淡出效果，默认300ms，可以传参
                .placeholder(errorimg)
                // 设置占位图
                .transform(new GlideRoundTransform(context, radius))//圆角显示
                .diskCacheStrategy(DiskCacheStrategy.RESULT)// 缓存修改过的图片
                .into(imgeview);
    }

    public static void showImageViewToRound(Context context,
                                            File file, int errorimg, int radius, ImageView imgeview) {
        Glide.with(context).load(file)
                // 加载图片
                .error(errorimg)
                // 设置错误图片
                .crossFade()
                // 设置淡入淡出效果，默认300ms，可以传参
                .placeholder(errorimg)
                // 设置占位图
                .transform(new GlideRoundTransform(context, radius))//圆角显示
                .diskCacheStrategy(DiskCacheStrategy.RESULT)// 缓存修改过的图片
                .into(imgeview);
    }

    /**
     * （2）
     * 获取到Bitmap---不设置错误图片，错误图片不显示
     */

    public static void showImageViewGone(Context context,
                                         final ImageView imageView, String url) {
        Glide.with(context).load(url).asBitmap()
                .diskCacheStrategy(DiskCacheStrategy.RESULT)// 缓存修改过的图片
                .into(new SimpleTarget<Bitmap>() {

                    @SuppressLint("NewApi")
                    @Override
                    public void onResourceReady(Bitmap loadedImage,
                                                GlideAnimation<? super Bitmap> arg1) {

                        imageView.setVisibility(View.VISIBLE);
                        BitmapDrawable bd = new BitmapDrawable(loadedImage);
                        imageView.setImageDrawable(bd);
                    }

                    @Override
                    public void onLoadFailed(Exception e, Drawable errorDrawable) {
                        // TODO Auto-generated method stub
                        super.onLoadFailed(e, errorDrawable);
                        imageView.setVisibility(View.GONE);
                    }

                });

    }

    /**
     * （3）
     * 设置RelativeLayout
     * <p>
     * 获取到Bitmap
     */
    public static void showImageView(Context context,
                                     String url, int errorimg, final RelativeLayout bgLayout) {
        Glide.with(context).load(url).asBitmap().error(errorimg)// 设置错误图片
                .diskCacheStrategy(DiskCacheStrategy.RESULT)// 缓存修改过的图片
                .placeholder(errorimg)// 设置占位图
                .into(new SimpleTarget<Bitmap>() {

                    @SuppressLint("NewApi")
                    @Override
                    public void onResourceReady(Bitmap loadedImage,
                                                GlideAnimation<? super Bitmap> arg1) {
                        BitmapDrawable bd = new BitmapDrawable(loadedImage);

                        bgLayout.setBackground(bd);

                    }

                    @Override
                    public void onLoadFailed(Exception e, Drawable errorDrawable) {
                        // TODO Auto-generated method stub
                        super.onLoadFailed(e, errorDrawable);

                        bgLayout.setBackground(errorDrawable);
                    }

                });
    }

    /**
     * （4）
     * 设置LinearLayout
     * <p>
     * 获取到Bitmap
     */

    public static void showImageView(Context context,
                                     String url, int errorimg, final LinearLayout bgLayout) {
        Glide.with(context).load(url).asBitmap().error(errorimg)// 设置错误图片
                .diskCacheStrategy(DiskCacheStrategy.RESULT)// 缓存修改过的图片
                .placeholder(errorimg)// 设置占位图
                .into(new SimpleTarget<Bitmap>() {

                    @SuppressLint("NewApi")
                    @Override
                    public void onResourceReady(Bitmap loadedImage,
                                                GlideAnimation<? super Bitmap> arg1) {
                        BitmapDrawable bd = new BitmapDrawable(loadedImage);

                        bgLayout.setBackground(bd);

                    }

                    @Override
                    public void onLoadFailed(Exception e, Drawable errorDrawable) {
                        // TODO Auto-generated method stub
                        super.onLoadFailed(e, errorDrawable);

                        bgLayout.setBackground(errorDrawable);
                    }

                });

    }

    /**
     * （5）
     * 设置FrameLayout
     * <p>
     * 获取到Bitmap
     */
    public static void showImageView(Context context,
                                     int resId, int errorimg, final ScrollView frameBg) {
        Glide.with(context).load(resId).asBitmap().error(errorimg)// 设置错误图片

                .diskCacheStrategy(DiskCacheStrategy.RESULT)// 缓存修改过的图片
                .placeholder(errorimg)// 设置占位图
                .into(new SimpleTarget<Bitmap>() {

                    @SuppressLint("NewApi")
                    @Override
                    public void onResourceReady(Bitmap loadedImage,
                                                GlideAnimation<? super Bitmap> arg1) {
                        BitmapDrawable bd = new BitmapDrawable(loadedImage);

                        frameBg.setBackground(bd);

                    }

                    @Override
                    public void onLoadFailed(Exception e, Drawable errorDrawable) {
                        // TODO Auto-generated method stub
                        super.onLoadFailed(e, errorDrawable);

                        frameBg.setBackground(errorDrawable);
                    }

                });

    }

    /**
     * （5）
     * 设置FrameLayout
     * <p>
     * 获取到Bitmap
     */
    public static void showImageView(Context context,
                                     int resId, int errorimg, final CoordinatorLayout frameBg) {
        Glide.with(context).load(resId).asBitmap().error(errorimg)// 设置错误图片

                .diskCacheStrategy(DiskCacheStrategy.RESULT)// 缓存修改过的图片
                .placeholder(errorimg)// 设置占位图
                .into(new SimpleTarget<Bitmap>() {

                    @SuppressLint("NewApi")
                    @Override
                    public void onResourceReady(Bitmap loadedImage,
                                                GlideAnimation<? super Bitmap> arg1) {
                        BitmapDrawable bd = new BitmapDrawable(loadedImage);

                        frameBg.setBackground(bd);

                    }

                    @Override
                    public void onLoadFailed(Exception e, Drawable errorDrawable) {
                        // TODO Auto-generated method stub
                        super.onLoadFailed(e, errorDrawable);

                        frameBg.setBackground(errorDrawable);
                    }

                });

    }

    public static void showImageView(Context context,
                                     int resId, int errorimg, final LinearLayout linearBg) {
        Glide.with(context).load(resId).asBitmap().error(errorimg)// 设置错误图片

                .diskCacheStrategy(DiskCacheStrategy.RESULT)// 缓存修改过的图片
                .placeholder(errorimg)// 设置占位图
                .into(new SimpleTarget<Bitmap>() {

                    @SuppressLint("NewApi")
                    @Override
                    public void onResourceReady(Bitmap loadedImage,
                                                GlideAnimation<? super Bitmap> arg1) {
                        BitmapDrawable bd = new BitmapDrawable(loadedImage);

                        linearBg.setBackground(bd);

                    }

                    @Override
                    public void onLoadFailed(Exception e, Drawable errorDrawable) {
                        // TODO Auto-generated method stub
                        super.onLoadFailed(e, errorDrawable);

                        linearBg.setBackground(errorDrawable);
                    }

                });

    }

    /**
     * （6）
     * 获取到Bitmap 高斯模糊         RelativeLayout
     */

    public static void showImageViewBlur(Context context,
                                         String url, int errorimg, final ImageView imageView) {
        Glide.with(context).load(url).asBitmap().error(errorimg)
                // 设置错误图片
                .diskCacheStrategy(DiskCacheStrategy.RESULT)
                // 缓存修改过的图片
                .placeholder(errorimg)
                .transform(new BlurTransformation(context))// 高斯模糊处理
                // 设置占位图
                .into(imageView);
    }

    public static void showImageViewBlur(Context context,
                                         int resId, int errorimg, final ImageView imageView) {
        Glide.with(context).load(resId).asBitmap().error(errorimg)
                // 设置错误图片
                .diskCacheStrategy(DiskCacheStrategy.RESULT)
                // 缓存修改过的图片
                .placeholder(errorimg)
                .transform(new BlurTransformation(context))// 高斯模糊处理
                // 设置占位图
                .into(imageView);
    }

    /**
     * （6）
     * 获取到Bitmap 高斯模糊         RelativeLayout
     */

    public static void showImageViewBlur(Context context,
                                         String url, int errorimg, final RelativeLayout bgLayout) {
        Glide.with(context).load(url).asBitmap().error(errorimg)
                // 设置错误图片
                .diskCacheStrategy(DiskCacheStrategy.RESULT)
                // 缓存修改过的图片
                .placeholder(errorimg)
                .transform(new BlurTransformation(context))// 高斯模糊处理
                // 设置占位图

                .into(new SimpleTarget<Bitmap>() {

                    @SuppressLint("NewApi")
                    @Override
                    public void onResourceReady(Bitmap loadedImage,
                                                GlideAnimation<? super Bitmap> arg1) {
                        BitmapDrawable bd = new BitmapDrawable(loadedImage);

                        bgLayout.setBackground(bd);

                    }

                    @Override
                    public void onLoadFailed(Exception e, Drawable errorDrawable) {
                        // TODO Auto-generated method stub
                        super.onLoadFailed(e, errorDrawable);

                        bgLayout.setBackgroundDrawable(errorDrawable);
                    }

                });
    }

    /**
     * （7）
     * 获取到Bitmap 高斯模糊 LinearLayout
     */

    public static void showImageViewBlur(Context context,
                                         String url, int errorimg, final LinearLayout bgLayout) {
        Glide.with(context).load(url).asBitmap().error(errorimg)
                // 设置错误图片
                .diskCacheStrategy(DiskCacheStrategy.RESULT)
                // 缓存修改过的图片
                .placeholder(errorimg)
                .transform(new BlurTransformation(context))// 高斯模糊处理
                // 设置占位图

                .into(new SimpleTarget<Bitmap>() {

                    @SuppressLint("NewApi")
                    @Override
                    public void onResourceReady(Bitmap loadedImage,
                                                GlideAnimation<? super Bitmap> arg1) {
                        BitmapDrawable bd = new BitmapDrawable(loadedImage);

                        bgLayout.setBackground(bd);

                    }

                    @Override
                    public void onLoadFailed(Exception e, Drawable errorDrawable) {
                        // TODO Auto-generated method stub
                        super.onLoadFailed(e, errorDrawable);

                        bgLayout.setBackgroundDrawable(errorDrawable);
                    }

                });

    }

}