package java8.Task04.ConsumerSupplier;

import java.util.Random;
import java.util.function.Supplier;

public class RandomOTPSupplier {
    public static void main(String[] args) {
        Supplier<String> otpSupplier = () -> {
            Random random = new Random();
            StringBuilder otpString = new StringBuilder();
            for (int i = 0; i < 6; i++) {
                int digit = random.nextInt(10);
                otpString.append(digit);
            }
            return otpString.toString();
        };

        String otp = otpSupplier.get();
        System.out.println("Generated OTP: " + otp);
    }
}
