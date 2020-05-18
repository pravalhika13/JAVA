package com.company;

public class VideoProcessor {
    //constructor injection to remove new instantiation of encoder object
    private VideoEncoder encoder;
    private VideoDatabase database;
    private EmailService emailService;

    public VideoProcessor(VideoEncoder encoder,VideoDatabase database,EmailService emailService) {
        this.encoder = encoder;
        this.database = database;
        this.emailService=emailService;
    }

    public void process(Video video) {
        //var encoder = new XVideoEncoder();
        encoder.encode(video);

        //var database = new XVideoDatabase();
        database.store(video);

        //var emailService = new XEmailService();
        emailService.sendEmail(video.getUser());
    }
}

