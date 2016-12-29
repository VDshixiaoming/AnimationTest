# AnimationTest
Useage

    /**
     * 将帧动画资源id以字符串数组形式写到values/arrays.xml中
     * FPS为每秒播放帧数，FPS = 1/T，（T--每帧间隔时间秒）
     */
     
    AnimationsContainer.FramesSequenceAnimation animation 
            = AnimationsContainer.getInstance(R.array.XXX, FPS).createProgressDialogAnim(imageView);
        
    animation.start();//动画开始
    
    animation.stop();//动画结束
