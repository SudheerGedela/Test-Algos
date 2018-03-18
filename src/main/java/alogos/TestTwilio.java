package alogos;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.IncomingPhoneNumber;

/**
 * Project: algo-test
 * Package: alogos
 * <p>
 * User: vthalapu
 * Date: 3/12/18
 * Time: 10:57 AM
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
public class TestTwilio {
    // Find your Account Sid and Token at twilio.com/user/account
//    public static final String ACCOUNT_SID = "ACe1c060cad73321de3ce70911957c1b05";
//    public static final String AUTH_TOKEN = "95e5c0e577bfc9106c9d9ee886bb6e28";
    public static final String ACCOUNT_SID = "AC5af9c05c9480eb938be33d34f562e86c";
    public static final String AUTH_TOKEN = "0a36c6459b578813c75079b5d453583e";

    public static void main(String[] args) {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

        // Get an object from its sid. If you do not have a sid,
        // check out the list resource examples on this page
//        IncomingPhoneNumber number =
//                IncomingPhoneNumber.fetcher("MGcf308d5636618d55404914f75bc8fe47").fetch();
        IncomingPhoneNumber number =
                IncomingPhoneNumber.fetcher("PN2a0747eba6abf96b7e3c3ff0b4530f6e").fetch();

        System.out.println(number.getPhoneNumber());
    }
}