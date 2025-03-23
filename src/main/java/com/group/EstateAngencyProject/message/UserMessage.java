package com.group.EstateAngencyProject.message;

public class UserMessage {
    public static final String NOT_NULL_PHONE_NUMBER = "Phone number is not null";
    public static final String NOT_NULL_FULL_NAME = "Full Name is not null";
    public static final String NOT_NULL_EMAIL = "Email is not null";
    public static final String DUPLICATED_PHONE_NUMBER = "Has User with this phone number";
    public static final String DUPLICATED_EMAIL = "Has User with this email";
    public static final String DUPLICATED_USER_NAME = "Has User with this username";
    public static final String CUSTOMER_EXIST = "User already exists";

    public static final String INVALID_PHONE_NUMBER = "Phone number must is number and right " +
            "format";

    public static final String INVALID_USER_NAME = "UserName must not have special Character except '_' and at least 5 characters ";

    public static final String INVALID_EMAIL = "Your email is invalid";

}
