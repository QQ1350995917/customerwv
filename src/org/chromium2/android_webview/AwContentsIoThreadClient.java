// Copyright (c) 2012 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium2.android_webview;

import org.chromium2.base.CalledByNative;
import org.chromium2.base.JNINamespace;

/**
 * Delegate for handling callbacks. All methods are called on the IO thread.
 *
 * You should create a separate instance for every WebContents that requires the
 * provided functionality.
 */
@JNINamespace("android_webview")
public interface AwContentsIoThreadClient {
    @CalledByNative
    public int getCacheMode();

    @CalledByNative
    public InterceptedRequestData shouldInterceptRequest(String url, boolean isMainFrame);

    @CalledByNative
    public boolean shouldBlockContentUrls();

    @CalledByNative
    public boolean shouldBlockFileUrls();

    @CalledByNative
    public boolean shouldBlockNetworkLoads();

    @CalledByNative
    public void onDownloadStart(String url,
                                String userAgent,
                                String contentDisposition,
                                String mimeType,
                                long contentLength);

    @CalledByNative
    public void newLoginRequest(String realm, String account, String args);
}
