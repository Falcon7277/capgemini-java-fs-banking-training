public class BiometricAuthProvider implements AuthenticationProvider {

    @Override
    public boolean authenticate(String userId, String credential) {
        if (!AuthenticationProvider.validateUserId(userId)) {
            return false;
        }

        return "BIO_HASH_OK".equals(credential);//hardcoded check
    }
}

