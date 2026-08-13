class Video {

    // Member variables
    private String videoName;
    private boolean checkout;
    private int rating;

    // Constructor
    Video(String name) {
        videoName = name;
        checkout = false;
        rating = 0;
    }

    // Returns video name
    public String getName() {
        return videoName;
    }

    // Checkout the video
    public void doCheckout() {
        checkout = true;
    }

    // Return the video
    public void doReturn() {
        checkout = false;
    }

    // Receive rating
    public void receiveRating(int rating) {
        this.rating = rating;
    }

    // Return rating
    public int getRating() {
        return rating;
    }

    // Return checkout status
    public boolean getCheckout() {
        return checkout;
    }
}