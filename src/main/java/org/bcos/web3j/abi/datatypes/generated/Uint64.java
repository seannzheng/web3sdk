package org.bcos.web3j.abi.datatypes.generated;

import java.math.BigInteger;
import org.bcos.web3j.abi.datatypes.Uint;

/**
 * <p>Auto generated code.<br>
 * <strong>Do not modifiy!</strong><br>
 * Please use {@link org.bcos.web3j.codegen.AbiTypesGenerator} to update.</p>
 */
public class Uint64 extends Uint {
    public static final Uint64 DEFAULT = new Uint64(BigInteger.ZERO);

    public Uint64(BigInteger value) {
        super(64, value);
    }

    public Uint64(long value) {
        this(BigInteger.valueOf(value));
    }
}
