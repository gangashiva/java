//package com.sync.test;
//
//package com.synchronoss.upm.api.server.config;
//
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.stereotype.Component;
//
//import javax.annotation.PostConstruct;
//import javax.validation.ValidationException;
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//import java.util.regex.PatternSyntaxException;
//
//@Component
//public class ConfigValidator {
//
//  @Value ("${upm.profile.userId.constraint}")
//  private String userIdConstraint;
//
//  @Value("${upm.profile.firstName.constraint}")
//  private String firstNameConstraint;
//
//  @Value("${upm.profile.lastName.constraint}")
//  private String lastNameConstraint;
//
//  private String validRegex ="^[A-Za-z0-9_-]*$";
//  private String firstAndLastNameConstraint ="^[\\p{L}' -]";
//  private String validUserInputString="UPPERCASElowercase0123456789";
//  private String validFirstAndLastNameConstraint ="lowercaseUPPERCASE'-";
//  private String defaultRegExpForUserID ="^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9]).{1,45}$";
//  private String defaultRegExpForFLName ="^(?=.*[a-z])(?=.*[A-Z]).{1,45}$";
//
//  @PostConstruct
//  public void validate() throws ValidationException
//  {
//    validateRegExp(userIdConstraint,defaultRegExpForUserID);
//    validateFistAndLastNameRegExp(firstNameConstraint,defaultRegExpForFLName);
//    validateFistAndLastNameRegExp(lastNameConstraint,defaultRegExpForFLName);
//  }
//
//  public boolean validateRegExp(String inputRegex, String defaultRegExpForUserID) throws ValidationException{
//    try {
//
//      if (inputRegex != null && !inputRegex.trim().isEmpty() && (inputRegex.contains("A-Za-z")) || (inputRegex.contains("a-zA-Z"))) {
//        validateUserIdFirstAndLastNameRegExp(validUserInputString,defaultRegExpForUserID);
//        return true;
//      } else
//        throw new ValidationException("Regular Expression should not be null,empty or regular expression is not valid");
//    }
//    catch(PatternSyntaxException e) {
//      throw new ValidationException("Regular Expression is not valid for the property: "+inputRegex);
//    }
//  }
//
//  public boolean validateFistAndLastNameRegExp(String firstAndLastNameRegex, String defaultRegExpForFLName ) throws ValidationException{
//    try {
//
//      if (firstAndLastNameRegex != null && !firstAndLastNameRegex.trim().isEmpty() && (firstAndLastNameRegex.contains("p{L}' -"))) {
//        validateUserIdFirstAndLastNameRegExp(validUserInputString, defaultRegExpForFLName);
//        return true;
//      } else
//        throw new ValidationException("Regular Expression should not be null,empty or regular expression is not valid");
//    }
//    catch(PatternSyntaxException e) {
//      throw new ValidationException("Regular Expression is not valid for the property: "+firstAndLastNameRegex);
//    }
//  }
//
//  public void validateUserIdFirstAndLastNameRegExp(String userIdFAndLNameConstraint, String defaultRegExp) throws ValidationException {
//    //String defaultRegExp ="^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9]).{1,45}$";
//    try {
//      if(userIdFAndLNameConstraint != null || !userIdFAndLNameConstraint.trim().isEmpty())
//      {
//        Pattern userIdFAndLNameConstraintPattern = Pattern.compile(userIdFAndLNameConstraint);
//        boolean isUserIdFAndLNameConstraintPattern = checkUnProStringRegExp(userIdFAndLNameConstraintPattern.toString(), defaultRegExp);
//        checkStringRegex(isUserIdFAndLNameConstraintPattern);
//
//      }
//      else{
//        throw new ValidationException("User input should not be null or empty.");
//      }
//    }catch(PatternSyntaxException e) {
//      throw new ValidationException("User input is not valid for the given property.");
//    }
//  }
//
//  private boolean checkUnProStringRegExp(String userIdFAndLNameConstraintRegExp, String defaultRegExp){
//    Pattern p = Pattern.compile(defaultRegExp);
//    Matcher m = p.matcher(userIdFAndLNameConstraintRegExp);
//    return m.matches();
//  }
//
//  private void checkStringRegex(boolean isUserIdFAndLNameConstraintPattern) throws ValidationException {
//    if(!isUserIdFAndLNameConstraintPattern){
//      throw new ValidationException("User input is not valid for the property userIdFAndLNameConstraintPattern");
//    }
//  }
//
//}
