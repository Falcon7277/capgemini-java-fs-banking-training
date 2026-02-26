public interface AuthenticationProvider {
    boolean authenticate(String userId, String credential);

    static boolean validateUserId(String userId) {
        // lets keep the userId  between 5-10 characters and alphanumeric
        return userId != null && userId.matches("[a-zA-Z0-9]{5,10}");
    }
}
