package com.exception;

import java.nio.channels.ScatteringByteChannel;
import java.sql.SQLOutput;

public class InvalidAgeCheckerException extends Exception {
    public InvalidAgeCheckerException (String msg)
    {
        super(msg);
    }
    }

    public class handlingpractice {
        static void ageChecker(int age) throws InvalidAgeCheckerException {
            if (age < 18) {
                throw new InvalidAgeCheckerException("Age is in valid for voting");
            }
            System.out.println("valid age for voting");
        }

        public static void main(String[] args)
        {
            try {
                ageChecker(18);
            } catch (InvalidAgeCheckerException e) {
                System.out.println(e);
            }
        }
    }
