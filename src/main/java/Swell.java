public class Swell {
    private String responseType = "echo";

    public static void main(String[] args) {
        System.out.println("Hello!");
    }

    /**
     * Generates a response for the user's chat message.
     */
    public String getResponse(String input) {
        if (input.trim().isEmpty()) {
            responseType = "empty";
            return "Say something first, and I'll catch the sparkle.";
        }

        if (input.trim().equalsIgnoreCase("bye")) {
            responseType = "farewell";
            return "Bye for now. See you under the next star!";
        }

        responseType = "echo";
        return "Swell heard: " + input;
    }

    public String getResponseType() {
        return responseType;
    }
}
