
需要动态申请的权限
private String [] permissions = {
            Manifest.permission.CAMERA,
            Manifest.permission.WRITE_EXTERNAL_STORAGE,
            Manifest.permission.READ_EXTERNAL_STORAGE,
            Manifest.permission.RECORD_AUDIO,
    };
    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        for (int i = 0; i < grantResults.length; i++) {
            if (grantResults[i] == -1){
                Toast.makeText(this, "请先打开录制视频的权限", Toast.LENGTH_SHORT).show();
                return;
            }
        }
        startActivityForResult(new Intent(this,CameraActivity.class),CameraActivity.CAMERA_REQUEST);
    }