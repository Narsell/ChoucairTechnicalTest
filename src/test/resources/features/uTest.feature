# Autor: Daniel Mateus

@stories
Feature: UTest
  As an user, I want to be able to sign up at Utest.com
  @scenario1
  Scenario Outline: Sign up as a new user
    Given that Daniel wants to sign up at Utest
    When provides the required information for the registration process
      | strFirstName   |  strLastName   |  strEmail   |   strBirthDateDay  |  strBirthDateMonth  | strBirthDateYear  | strCity   | strZipCode   | strCountry  |  strOSType  |  strOSVersion  |   strOSLanguage   |   strPhoneBrand   |  strPhoneModel   |   strPhoneOS   |  strPassword  |
      | <strFirstName> |  <strLastName> | <strEmail>  | <strBirthDateDay>  | <strBirthDateMonth> | <strBirthDateYear>| <strCity> | <strZipCode> |<strCountry> | <strOSType> | <strOSVersion> |  <strOSLanguage>  |  <strPhoneBrand>  | <strPhoneModel>  |   <strPhoneOS> | <strPassword> |
    Then he is registered as a new user at Utest

    Examples:
      | strFirstName   |  strLastName   |         strEmail           |   strBirthDateDay  | strBirthDateMonth | strBirthDateYear | strCity  |  strZipCode  | strCountry   |  strOSType  |  strOSVersion  |   strOSLanguage   |   strPhoneBrand   |  strPhoneModel   |   strPhoneOS   |  strPassword  |
      |      Carl      |    Sagan       | Carl.sagan@gmail.com       |          9         |     November      |       1934       | Bogota   |  130537      | Colombia     | Windows     |       10       |  English          |      Motorola     |  Moto G8 Plus    |   Android 10   |   P4ssw@rd1.  |

