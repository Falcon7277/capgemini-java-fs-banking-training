public class AuthProviderFactory {

    public static AuthenticationProvider getProvider(String type) {

        switch (type.toUpperCase()) {
            case "PASSWORD":
                return new PasswordAuthProvider();
            case "OTP":
                return new OtpAuthProvider();
            case "BIOMETRIC":
                return new BiometricAuthProvider();
            default:
                throw new IllegalArgumentException("Invalid authentication type");
        }
    }
}

