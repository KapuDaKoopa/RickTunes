package com.andromo.dev576782.app537736;

import android.os.Build.VERSION;
import android.support.v4.app.FragmentTransaction;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Collection;

final class dy {
    static ByteArrayInputStream m1351a(URLConnection uRLConnection, int i) {
        InputStream inputStream;
        Throwable th;
        ByteArrayInputStream byteArrayInputStream = null;
        if (uRLConnection != null) {
            try {
                inputStream = uRLConnection.getInputStream();
                try {
                    byteArrayInputStream = new ByteArrayInputStream(m1357a(inputStream, i));
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException e) {
                            throw e;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException e2) {
                            throw e2;
                        }
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                Throwable th4 = th3;
                inputStream = null;
                th = th4;
                if (inputStream != null) {
                    inputStream.close();
                }
                throw th;
            }
        }
        return byteArrayInputStream;
    }

    static String m1352a(URLConnection uRLConnection, String str) {
        if (uRLConnection == null) {
            return str;
        }
        String contentEncoding = uRLConnection.getContentEncoding();
        "content-encoding equals \"" + contentEncoding + "\"";
        if (contentEncoding == null) {
            String contentType = uRLConnection.getContentType();
            "content-type equals \"" + contentType + "\"";
            if (contentType != null) {
                for (String trim : contentType.split(";")) {
                    String trim2 = trim2.trim();
                    if (trim2.toLowerCase().startsWith("charset=")) {
                        contentEncoding = trim2.substring(8);
                        "encoding from content-type equals \"" + contentEncoding + "\"";
                        break;
                    }
                }
            }
            if (contentEncoding == null || "".equals(contentEncoding)) {
                "setting encoding to default: \"" + str + "\"";
                return str;
            }
        }
        return contentEncoding;
    }

    static HttpURLConnection m1353a(String str, String str2, String str3, int i, int i2) {
        if (VERSION.SDK_INT < 8) {
            System.setProperty("http.keepAlive", "false");
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setRequestProperty("Connection", "close");
        if (str3 != null) {
            httpURLConnection.setRequestProperty("User-Agent", str3);
        }
        if (str2 != null) {
            httpURLConnection.setRequestProperty("Accept", str2);
        }
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setDoInput(true);
        httpURLConnection.setConnectTimeout(i);
        httpURLConnection.setReadTimeout(i2);
        httpURLConnection.connect();
        return httpURLConnection;
    }

    static void m1354a(String str, File file, String str2, Collection collection, dz dzVar) {
        if (str == null) {
            throw new IllegalArgumentException("spec cannot be null");
        } else if (file == null) {
            throw new IllegalArgumentException("toFile cannot be null");
        } else {
            URLConnection a = m1353a(str, str2, null, 30000, 60000);
            if (a == null) {
                return;
            }
            if (collection == null || !m1356a(a, collection)) {
                m1355a(a, file, dzVar);
                return;
            }
            throw new FileNotFoundException("Unacceptable content-type.");
        }
    }

    private static void m1355a(HttpURLConnection httpURLConnection, File file, dz dzVar) {
        Throwable th;
        if (httpURLConnection == null) {
            throw new IllegalArgumentException("connection cannot be null");
        } else if (file == null) {
            throw new IllegalArgumentException("toFile cannot be null");
        } else {
            BufferedInputStream bufferedInputStream;
            BufferedOutputStream bufferedOutputStream;
            BufferedInputStream bufferedInputStream2 = null;
            BufferedOutputStream bufferedOutputStream2 = null;
            if (httpURLConnection != null) {
                try {
                    int contentLength = httpURLConnection.getContentLength();
                    int responseCode = httpURLConnection.getResponseCode();
                    if (contentLength <= 0) {
                        throw new FileNotFoundException("The content-length indicates an empty file or a stream.");
                    }
                    if (dzVar != null) {
                        dzVar.m1359b((long) contentLength);
                    }
                    if (responseCode >= 400) {
                        throw new FileNotFoundException("Invalid response code.");
                    }
                    bufferedInputStream = new BufferedInputStream(httpURLConnection.getInputStream());
                    try {
                        bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
                        try {
                            byte[] bArr = new byte[FragmentTransaction.TRANSIT_EXIT_MASK];
                            long j = 0;
                            if (dzVar == null) {
                                while (true) {
                                    int read = bufferedInputStream.read(bArr);
                                    if (read == -1) {
                                        break;
                                    }
                                    bufferedOutputStream.write(bArr, 0, read);
                                    j += (long) read;
                                }
                            } else {
                                long j2 = 32768;
                                while (true) {
                                    int read2 = bufferedInputStream.read(bArr);
                                    if (read2 == -1) {
                                        break;
                                    }
                                    bufferedOutputStream.write(bArr, 0, read2);
                                    long j3 = ((long) read2) + j;
                                    if (j3 >= j2) {
                                        dzVar.m1358a(j3);
                                        j2 = 32768 + j3;
                                        j = j3;
                                    } else {
                                        j = j3;
                                    }
                                }
                                if (j > j2) {
                                    dzVar.m1358a(j);
                                }
                            }
                            if (j <= 0) {
                                throw new FileNotFoundException("Empty file (no data retrieved).");
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            bufferedOutputStream2 = bufferedOutputStream;
                            bufferedInputStream2 = bufferedInputStream;
                            if (bufferedInputStream2 != null) {
                                try {
                                    bufferedInputStream2.close();
                                } catch (IOException e) {
                                }
                            }
                            if (bufferedOutputStream2 != null) {
                                try {
                                    bufferedOutputStream2.close();
                                } catch (IOException e2) {
                                }
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        bufferedInputStream2 = bufferedInputStream;
                        if (bufferedInputStream2 != null) {
                            bufferedInputStream2.close();
                        }
                        if (bufferedOutputStream2 != null) {
                            bufferedOutputStream2.close();
                        }
                        throw th;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    if (bufferedInputStream2 != null) {
                        bufferedInputStream2.close();
                    }
                    if (bufferedOutputStream2 != null) {
                        bufferedOutputStream2.close();
                    }
                    throw th;
                }
            }
            bufferedInputStream = null;
            bufferedOutputStream = null;
            if (bufferedInputStream != null) {
                try {
                    bufferedInputStream.close();
                } catch (IOException e3) {
                }
            }
            if (bufferedOutputStream != null) {
                try {
                    bufferedOutputStream.close();
                } catch (IOException e4) {
                }
            }
        }
    }

    static boolean m1356a(URLConnection uRLConnection, Collection collection) {
        if (!(uRLConnection == null || collection == null || collection.size() <= 0)) {
            String contentType = uRLConnection.getContentType();
            if (contentType != null) {
                contentType = contentType.toLowerCase();
                int indexOf = contentType.indexOf(59);
                if (indexOf != -1) {
                    contentType = contentType.substring(0, indexOf);
                    contentType.trim();
                }
                String str = contentType;
                for (String contentType2 : collection) {
                    if (str.equals(contentType2)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private static byte[] m1357a(InputStream inputStream, int i) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[FragmentTransaction.TRANSIT_EXIT_MASK];
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                break;
            }
            byteArrayOutputStream.write(bArr, 0, read);
            if (i > 0 && byteArrayOutputStream.size() >= i) {
                break;
            }
        }
        return byteArrayOutputStream.toByteArray();
    }
}
