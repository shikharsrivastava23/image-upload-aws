package com.example.imageuploadaws.bucket;

public enum BucketName {
    PROFILE_IMAGE("shikhar-image-upload-app");

    private final String bucketName;

    BucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public String getBucketName() {
        return bucketName;
    }
}
