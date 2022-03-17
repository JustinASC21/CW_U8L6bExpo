public class Encryptor
{
  private int strOrigLen;
  /** A two-dimensional array of single-character strings, instantiated in the constructor */
  private String[][] letterBlock;

  /** The number of rows of letterBlock, set by the constructor */
  private int numRows;

  /** The number of columns of letterBlock, set by the constructor */
  private int numCols;

  /** Constructor*/
  public Encryptor(int r, int c)
  {
    letterBlock = new String[r][c];
    numRows = r;
    numCols = c;
    strOrigLen = 0;
  }
  
  public String[][] getLetterBlock()
  {
    return letterBlock;
  }
  
  /** Places a string into letterBlock in row-major order.
   *
   *   @param str  the string to be processed
   *
   *   Postcondition:
   *     if str.length() < numRows * numCols, "A" in each unfilled cell
   *     if str.length() > numRows * numCols, trailing characters are ignored
   */
  public void fillBlock(String str)
  {
    for (int r = 0; r < letterBlock.length; r ++) {
      for (int c = 0; c < letterBlock[0].length; c++) {
        int index = r * letterBlock[0].length + c;
        if (index >= str.length()) {
          letterBlock[r][c] = "A";
        }
        else {
          letterBlock[r][c] = str.substring(index,index+1);
        }
      }
    }
  }

  /** Extracts encrypted string from letterBlock in column-major order.
   *
   *   Precondition: letterBlock has been filled
   *
   *   @return the encrypted string from letterBlock
   */
  public String encryptBlock()
  {
    String enc = "";
    for (int c = 0; c < letterBlock[0].length; c ++) {
      for (int r = 0; r < letterBlock.length; r ++) {
        enc += letterBlock[r][c];
      }
    }
    return enc;
  }

  // shift by decimal number
  public void shiftByX(int dec) {
    for (int r = 0; r < letterBlock.length; r++) {
      for (int c = 0; c < letterBlock[0].length; c++) {
        char letter = letterBlock[r][c].charAt(0);
        int newVal = (int) (letter) + dec;
        if (newVal > 122) {
          newVal -= 26;
        }
        else if (newVal < 97) {
          newVal += 26;
        }
        String newLetter = Character.toString(newVal);
        letterBlock[r][c] = newLetter;
        System.out.println(newLetter);
      }
    }
  }
  //shift to the left
  public void shiftLeft(int offset) {
    for (int )
  }
  /** Encrypts a message.
   *
   *  @param message the string to be encrypted
   *
   *  @return the encrypted message; if message is the empty string, returns the empty string
   */
  public String encryptMessage(String message)
  {
    strOrigLen = message.length();
    // key is 8 / numCols * numRows
    String encrypted = "";
    int blockArea = (numCols * numRows);
    int originalMsgLen = message.length();
    while (originalMsgLen % blockArea != 0) {
      originalMsgLen += 1;
    }
    int iterations = originalMsgLen / blockArea;
    int ind = 0;
    for (int block = 0; block < iterations; block++) {
      int end = ind + blockArea;

      if (end > message.length())
        end = message.length();
      fillBlock(message.substring(ind, end));
      encrypted += encryptBlock();
      ind += blockArea;
    }
    return encrypted;
  }
  
  /**  Decrypts an encrypted message. All filler 'A's that may have been
   *   added during encryption will be removed, so this assumes that the
   *   original message (BEFORE it was encrypted) did NOT end in a capital A!
   *
   *   NOTE! When you are decrypting an encrypted message,
   *         be sure that you have initialized your Encryptor object
   *         with the same row/column used to encrypted the message! (i.e. 
   *         the “encryption key” that is necessary for successful decryption)
   *         This is outlined in the precondition below.
   *
   *   Precondition: the Encryptor object being used for decryption has been
   *                 initialized with the same number of rows and columns
   *                 as was used for the Encryptor object used for encryption. 
   *  
   *   @param encryptedMessage  the encrypted message to decrypt
   *
   *   @return  the decrypted, original message (which had been encrypted)
   *
   *   TIP: You are encouraged to create other helper methods as you see fit
   *        (e.g. a method to decrypt each section of the decrypted message,
   *         similar to how encryptBlock was used)
   */
  public String decryptMessage(String encryptedMessage)
  {
    int blockA = (numCols * numRows);
    String totalMsg = "";
    int ind = 0;
    for (int loop = 0; loop < encryptedMessage.length() / blockA; loop ++) {
      int end = ind + blockA;
      totalMsg += readDecryption(decryptBlock(numRows,numCols,encryptedMessage.substring(ind,end)));
      ind+= blockA;
    }
    return cleanStringDecryption(totalMsg);
  }

  public String[][] decryptBlock(int col, int row, String msg) {
    String[][] decryptedBlock = new String[row][col];
    for (int c = 0; c < decryptedBlock[0].length; c++) {
      for (int r = 0; r < decryptedBlock.length; r++) {
        int index = c + (r * decryptedBlock[0].length);
        decryptedBlock[r][c] = msg.substring(index, index +1);
      }
    }
    return decryptedBlock;
    // return in column major form, then read from up to down
  }
  public String readDecryption(String[][] decryptedBlock) {
    String msg = "";
    for (int c = 0; c < decryptedBlock[0].length; c++) {
      for (int r = 0; r < decryptedBlock.length; r ++) {
          msg += decryptedBlock[r][c];
      }
    }
    return msg;
  }

  public String cleanStringDecryption(String decryptedString) {
    int ind = decryptedString.length();
    while (decryptedString.substring(ind-1,ind).equals("A")) {
      decryptedString = decryptedString.substring(0,ind);
      ind --;
    }
    return decryptedString;
  }


}