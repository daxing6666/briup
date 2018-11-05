package com.briup.frame.imageviewpager.glide.sunfusheng.progress;

/**
 */
public interface OnProgressListener {
  void onProgress(String url, boolean isComplete, int percentage, long bytesRead, long totalBytes);
}