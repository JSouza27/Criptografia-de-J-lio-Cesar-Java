package challenge;

public class CriptografiaCesariana implements Criptografia {

  @Override
  public String criptografar(String texto) {

    String transformForLowerCase = texto.toLowerCase();
    String cript = "";
    char character;
    int index, textLength;

    if (transformForLowerCase == null) throw new NullPointerException();
    if (transformForLowerCase.length() == 0) throw new IllegalArgumentException();

    textLength = transformForLowerCase.length();

    for (index = 0; index < textLength; index++) {
      character = transformForLowerCase.charAt(index);

      if (character == ' ') cript = cript + character;
      if ((character >= '0') && (character <= '9')) cript = cript + character;
      if ((character >= 'a') && (character <= 'z')) cript = cript + (char)(character + 3);
    }

    return cript;
  }

  @Override
  public String descriptografar(String texto) {

    String transformToLowerCase = texto.toLowerCase();
    String descript = "";
    char character;
    int index, textLength;

    if (transformToLowerCase == null) throw new NullPointerException();
    if (transformToLowerCase.length() == 0) throw new IllegalArgumentException();

    textLength = transformToLowerCase.length();

    for (index = 0; index < textLength; index++) {
      character = transformToLowerCase.charAt(index);

      if (character == ' ') descript = descript + character;
      if ((character >= '0') && (character <= '9')) descript = descript + character;
      if ((character >= 'a') && (character <= 'z')) descript = descript + (char)(character - 3);
    }

    return descript;
  }
}
