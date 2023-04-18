package com.kodilla.MirrorString;

import com.kodilla.MirrorString.MirrorStringMain;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.*;

public class MirrorStringMainTestSuite {

    @Test
    void testMirrorString() {

        //given
        MirrorStringMain mirror = new MirrorStringMain();

        String firstString = "Adam";
        String secondString = "Ewa";
        String thirdString = "Kayak";

        //when
        String actual1 = mirror.makeMirrorString(firstString);
        String actual2 = mirror.makeMirrorString(secondString);
        String actual3 = mirror.makeMirrorString(thirdString);

        //then
        Assertions.assertEquals("madA", actual1);
        Assertions.assertEquals("awE", actual2);
        Assertions.assertEquals("kayaK", actual3);


    }


}
