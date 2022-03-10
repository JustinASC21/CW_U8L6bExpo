public class Test {
    public static void main(String[] args) {

        System.out.println("\n---- TESTING ----");
        Encryptor encryptorTest1 = new Encryptor(3, 4);
        String actualEncrypted1 = encryptorTest1.encryptMessage("What are you doing next weekend?");
        String expectedEncrypted1 = "W  hayaroteu nedgxo tin weAenAedAk?A";
        if (actualEncrypted1.equals(expectedEncrypted1))
        {
            System.out.println("\nTest 1 PASSED!");
        }
        else
        {
            System.out.println("\n*** Test 1 FAILED! ***");
            System.out.println("EXPECTED: " + expectedEncrypted1);
            System.out.println("  ACTUAL: " + actualEncrypted1);
        }
        Encryptor encryptorTest2 = new Encryptor(6, 5);
        String actualEncrypted2 = encryptorTest2.encryptMessage("This one time I was trying to do a handstand and fell backwards and landed on my shoe. It hurt! I won't try that again.");
        String expectedEncrypted2 = "Toi tghnmwr ieeayts  sio tI n dhtaeaoaanlc nndlkadd  w s fbarnno .dddns s e hI ldmotaa ye h nraauI'ytir t  ntw ta.!othgA";
        if (actualEncrypted2.equals(expectedEncrypted2))
        {
            System.out.println("\nTest 2 PASSED!");
        }
        else
        {
            System.out.println("\n*** Test 2 FAILED! ***");
            System.out.println("EXPECTED: " + expectedEncrypted2);
            System.out.println("  ACTUAL: " + actualEncrypted2);
        }

        System.out.println("\n---- TESTING ----");
        Encryptor encryptorTester1 = new Encryptor(3, 2);
        String actualDecrypted1 = encryptorTester1.decryptMessage("Ti hsiscn ofietdnia!Bl e nto helo okotAu!A");
        String expectedDecrypted1 = "This is confidential! Be on the lookout!";
        if (actualDecrypted1.equals(expectedDecrypted1))
        {
            System.out.println("\nTest 1 PASSED!");
        }
        else {
            System.out.println("\n*** Test 1 FAILED! ***");
            System.out.println("EXPECTED: " + expectedDecrypted1);
            System.out.println("  ACTUAL: " + actualDecrypted1);
        }
        Encryptor encryptorTester2 = new Encryptor(5, 5);
        String actualDecrypted2 = encryptorTester2.decryptMessage("Tite hsocmi presa es  stsaneregtd see J  nfaBidomonee  d ftm.cuhe alisBr,ssaieecgllstelft!  -rAwsduA");
        String expectedDecrypted2 = "This is a top secret message intended for James Bond. Be careful, this message will self-destruct!";
        if (actualDecrypted2.equals(expectedDecrypted2))
        {
            System.out.println("\nTest 2 PASSED!");
        }
        else {
            System.out.println("\n*** Test 2 FAILED! ***");
            System.out.println("EXPECTED: " + expectedDecrypted2);
            System.out.println("  ACTUAL: " + actualDecrypted2);
        }
        Encryptor encryptorTester3 = new Encryptor(6, 5);
        String actualDecrypted3 = encryptorTester3.decryptMessage("Meottai ooufdsl rtdcsrnelh e r etWwht hhiihmselgro.nlhen    sld tmc egoehsne  otttcbous oacHusAAkoloAA?ploAA eynAA f !AA");
        String expectedDecrypted3 = "Middle schools to return after three months. When will high school students get to come back?  Hopefully soon!";
        if (actualDecrypted3.equals(expectedDecrypted3))
        {
            System.out.println("\nTest 3 PASSED!");
        }
        else {
            System.out.println("\n*** Test 3 FAILED! ***");
            System.out.println("EXPECTED: " + expectedDecrypted3);
            System.out.println("  ACTUAL: " + actualDecrypted3);
        }
        Encryptor encryptorTester4 = new Encryptor(9, 8);
        String actualDecrypted4 = encryptorTester4.decryptMessage("Io ihscnongeoesofn rnn  do.cac poir rprirfnmTyhyso gahpyp ce tit,tteniis  siea o,pc gpttr rotirihmkonhneoeancveasn toee le iiwsro nononstrrtffn atttencxlseoe oitl x rfwp.yptanonh ,l,nar eI a  tmardoiiai stennnlvk ealyit real  zid rcaaaeeeatkinudsc e ndt  icxtt hpcpitoeaoaahp  xcrrnehbptceo tc t  sriird pisinoyoirn gfnpetettio.tssvehnr i eereamEonlnf lannoftert eetoite tl  unondhlctltrceeioode.en gn -r  iiitabcFbenbe eeoustlnw pr annn  patlsc uusne ,rsssedcr ycueuoheaphasdmnantel o is imla-ecoeoey rnc eyoIsotrkr rts  yeaai idtpytntibeht e hslceigdam er oe l.p ymnnbg otpests  r-dtshstb d iaoehuaeeoguset snnets ,wic   ik egrswpneflnyciogyolephesearsi dmi te lr.edcisale ,eooonsqA rmnud uncapar ai obulcsrranlt ekeeut naceehrhrtsr  eooe iymw vrcclpeikiiiaytstedzpn  shyeei dta  ddeeehgtp brribthuAyi puoosA gtit reAtioe uirAhn nnnzsAeartoae.A testudAAooc  t AA");
        String expectedDecrypted4 = "In cryptography, encryption is the process of encoding information. This process converts the original representation of the information, known as plaintext, into an alternative form known as ciphertext. Ideally, only authorized parties can decipher a ciphertext back to plaintext and access the original information. Encryption does not itself prevent interference but denies the intelligible content to a would-be interceptor. For technical reasons, an encryption scheme usually uses a pseudo-random encryption key generated by an algorithm. It is possible to decrypt the message without possessing the key but, for a well-designed encryption scheme, considerable computational resources and skills are required. An authorized recipient can easily decrypt the message with the key provided by the originator to recipients but not to unauthorized users.";
        if (actualDecrypted4.equals(expectedDecrypted4))
        {
            System.out.println("\nTest 4 PASSED!");
        }
        else {
            System.out.println("\n*** Test 4 FAILED! ***");
            System.out.println("EXPECTED: " + expectedDecrypted4);
            System.out.println("  ACTUAL: " + actualDecrypted4);
        }

        System.out.println("\n---- TESTING ----");
        Encryptor encryptorTest3 = new Encryptor(9, 9);
        String actualEncrypted3 = encryptorTest3.encryptMessage("This is not a super secret message");
        String expectedEncrypted3 = "TormAAAAAht eAAAAAi ssAAAAAsaesAAAAA  caAAAAAisrgAAAAAsueeAAAAA ptAAAAAAne AAAAAA";
        if (actualEncrypted3.equals(expectedEncrypted3))
        {
            System.out.println("\nTest 1 PASSED!");
        }
        else
        {
            System.out.println("\n*** Test 1 FAILED! ***");
            System.out.println("EXPECTED: " + expectedEncrypted3);
            System.out.println("  ACTUAL: " + actualEncrypted3);
        }

        Encryptor encryptorTest10 = new Encryptor(3, 3);
        String actualEncrypted10 = encryptorTest10.encryptMessage("Message was made minute ago");
        String expectedEncrypted10 = "Mseea sgwamesa  dmitanegu o";
        if (actualEncrypted10.equals(expectedEncrypted10))
        {
            System.out.println("\nTest 1 PASSED!");
        }
        else
        {
            System.out.println("\n*** Test 1 FAILED! ***");
            System.out.println("EXPECTED: " + expectedEncrypted10);
            System.out.println("  ACTUAL: " + actualEncrypted10);
        }

        Encryptor encryptorTester5 = new Encryptor(3, 3);
        String actualDecrypted5 = encryptorTester5.decryptMessage("Mseea sgwamesa  dmitanegu o");
        String expectedDecrypted5 = "Message was made minute ago";
        if (actualDecrypted5.equals(expectedDecrypted5))
        {
            System.out.println("\nTest 2 PASSED!");
        }
        else {
            System.out.println("\n*** Test 2 FAILED! ***");
            System.out.println("EXPECTED: " + expectedDecrypted5);
            System.out.println("  ACTUAL: " + actualDecrypted5);
        }
    }
}