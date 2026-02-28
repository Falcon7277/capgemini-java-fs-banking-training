public class AuthenticationApp {
    public static void main(String[] args) {
        String authType = "OTP";
        String userId = "user123";
        String credential = "456789";

        AuthenticationProvider provider =
                AuthProviderFactory.getProvider(authType);

        boolean result = provider.authenticate(userId, credential);

        System.out.println("Authentication successful: " + result + "\nAuthenticated using authType: " + authType);
    }
}
