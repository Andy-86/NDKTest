#include <jni.h>

JNIEXPORT jstring JNICALL
Java_com_example_andy_ndktest_MainActivity_getString(JNIEnv *env, jobject instance) {

    // TODO


    return (*env)->NewStringUTF(env, "AndroidStudio NDK开发最佳入门实践");
}