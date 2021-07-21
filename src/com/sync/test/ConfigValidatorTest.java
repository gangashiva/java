//package com.sync.test;
//
//package com.synchronoss.upm.api.server.config;
//
//
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import javax.validation.ValidationException;
//
//public class ConfigValidatorTest {
//  ConfigValidator configValidator;
//
//  private String defaultRegExpForUserID ="^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9]).{1,45}$";
//  private String defaultRegExpForFLName ="^(?=.*[a-z])(?=.*[A-Z]).{1,45}$";
//
//  @BeforeEach
//  public void setUp(){
//    configValidator =  new ConfigValidator();
//  }
//
//  @Test
//  public void testValidUserIdFirstAndLastNameRegExp() {
//    configValidator.validateUserIdFirstAndLastNameRegExp("UPPERCASElowercase123456789", defaultRegExpForUserID);
//    configValidator.validateUserIdFirstAndLastNameRegExp("lowercaseUPPERCASE123456789", defaultRegExpForUserID);
//    configValidator.validateUserIdFirstAndLastNameRegExp("123456789lowercaseUPPERCASE", defaultRegExpForUserID);
//  }
//
//  @Test
//  public void testInValidUserIdFirstAndLastNameRegExp() throws ValidationException {
//    Assertions.assertThrows(ValidationException.class, ()->{configValidator.validateUserIdFirstAndLastNameRegExp("@!%$",defaultRegExpForUserID);});
//    Assertions.assertThrows(ValidationException.class, ()->{configValidator.validateUserIdFirstAndLastNameRegExp("onlylowercase",defaultRegExpForUserID);});
//    Assertions.assertThrows(ValidationException.class, ()->{configValidator.validateUserIdFirstAndLastNameRegExp("ONLYUPPERCASE",defaultRegExpForUserID);});
//    Assertions.assertThrows(ValidationException.class, ()->{configValidator.validateUserIdFirstAndLastNameRegExp("onlylowercaseONLYUPPERCASE",defaultRegExpForUserID);});
//    Assertions.assertThrows(ValidationException.class, ()->{configValidator.validateUserIdFirstAndLastNameRegExp("User input string is not more then 45 characters are not valid!",defaultRegExpForUserID);});
//    Assertions.assertThrows(ValidationException.class, ()->{configValidator.validateUserIdFirstAndLastNameRegExp("123456789",defaultRegExpForUserID);});
//
//  }
//
//  @Test
//  public void testValidRegx() throws ValidationException {
//    Assertions.assertTrue(configValidator.validateRegExp("[a-zA-Z0-9_-]*$",defaultRegExpForUserID));
//    Assertions.assertTrue(configValidator.validateRegExp("[a-zA-Z0-9]*$",defaultRegExpForUserID));
//    Assertions.assertTrue(configValidator.validateRegExp("[a-zA-Z]*$",defaultRegExpForUserID));
//    Assertions.assertTrue(configValidator.validateRegExp("[A-Za-z]*$",defaultRegExpForUserID));
//
//  }
//
//  @Test
//  public void testInValidRegx() throws ValidationException {
//    Assertions.assertThrows(ValidationException.class, ()->{configValidator.validateRegExp("",defaultRegExpForUserID);});
//    Assertions.assertThrows(ValidationException.class, ()->{configValidator.validateRegExp("  ",defaultRegExpForUserID);});
//    Assertions.assertThrows(ValidationException.class, ()->{configValidator.validateRegExp("[a-z]*$",defaultRegExpForUserID);});
//    Assertions.assertThrows(ValidationException.class, ()->{configValidator.validateRegExp("[A-Z]*$",defaultRegExpForUserID);});
//    Assertions.assertThrows(ValidationException.class, ()->{configValidator.validateRegExp("[A-Z]*$",defaultRegExpForUserID);});
//    Assertions.assertThrows(ValidationException.class, ()->{configValidator.validateRegExp("[0-9_-]*$",defaultRegExpForUserID);});
//    Assertions.assertThrows(ValidationException.class, ()->{configValidator.validateRegExp("[e+)+",defaultRegExpForUserID);});
//    Assertions.assertThrows(ValidationException.class, ()->{configValidator.validateRegExp("((e|ee)+",defaultRegExpForUserID);});
//
//  }
//
//  @Test
//  public void testValidFirstAndLastNameRegx() throws ValidationException {
//    Assertions.assertTrue(configValidator.validateFistAndLastNameRegExp("[^[\\p{L}' -]",defaultRegExpForFLName));
//    //Assertions.assertTrue(configValidator.validateFistAndLastNameRegExp("[^[\\p{L}]",defaultRegExpForFLName));
//    //Assertions.assertTrue(configValidator.validateFistAndLastNameRegExp("[^[\\p{L}]",defaultRegExpForFLName));
//
//
//  }
//
//}
