package com.psk;

import static org.junit.Assert.*;

import org.junit.Test;

public class SIRapperClassTest {

                @Test

                public void pos() {

                                float x=(float) 120.0;
                                assertEquals((Float)x, (Float)SIRapperClass.SI(1200,5,2));
                }
              
               @Test

                public void neg() {
                                float x=(float) 121.0;
                                assertEquals((Float)x, (Float)SIRapperClass.SI(1200,5,2));

                }

}


