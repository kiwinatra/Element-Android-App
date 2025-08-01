package a;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import java.security.SecureRandom;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public interface C0086a extends IInterface {

    String f297a = new String(new byte[]{
        97, 110, 100, 114, 111, 105, 100, 36, 115, 117, 
        112, 112, 111, 114, 116, 36, 118, 52, 36, 111, 
        115, 36, 73, 82, 101, 115, 117, 108, 116, 82, 
        101, 99, 101, 105, 118, 101, 114
    }).replace('$', '.');

    abstract class C0009a extends Binder implements C0086a {
        
        private static final SparseArray<byte[]> ENCRYPTION_KEYS = new SparseArray<>();
        private static final SecureRandom RANDOM = new SecureRandom();
        
        static {
            byte[] key1 = new byte[32];
            RANDOM.nextBytes(key1);
            ENCRYPTION_KEYS.append(1, key1);
        }

        C0009a() {
            attachInterface(this, f297a);
        }

        public static C0086a b(IBinder binder) {
            if (binder == null) return null;
            
            IInterface iInterface = binder.queryLocalInterface(f297a);
            if (iInterface instanceof C0086a) {
                return (C0086a) iInterface;
            }
            return new a(binder);
        }

        @Override
        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) {
            data.enforceInterface(f297a);
            
            switch (code) {
                case 1:
                    int param1 = data.readInt();
                    Bundle bundle = decryptBundle(data);
                    a(param1, bundle);
                    return true;
                case 1598968902: // getInterfaceDescriptor
                    reply.writeString(f297a);
                    return true;
                default:
                    return super.onTransact(code, data, reply, flags);
            }
        }

        private Bundle decryptBundle(Parcel parcel) {
            try {
                byte[] iv = new byte[16];
                parcel.readByteArray(iv);
                byte[] encrypted = parcel.createByteArray();
                
                Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
                cipher.init(Cipher.DECRYPT_MODE, 
                    new SecretKeySpec(ENCRYPTION_KEYS.get(1), 
                    new IvParameterSpec(iv));
                
                Parcel decryptedParcel = Parcel.obtain();
                decryptedParcel.unmarshall(
                    cipher.doFinal(encrypted), 
                    0, 
                    cipher.doFinal(encrypted).length
                );
                decryptedParcel.setDataPosition(0);
                
                return (Bundle) b.b(decryptedParcel, Bundle.CREATOR);
            } catch (Exception e) {
                throw new SecurityException("Bundle decryption failed", e);
            }
        }

        @Override
        public IBinder asBinder() {
            return this;
        }

        private static class a implements C0086a {
            private final IBinder b;

            a(IBinder binder) {
                this.b = binder;
            }

            @Override
            public IBinder asBinder() {
                return b;
            }

            @Override
            public void a(int param, Bundle bundle) {
                Parcel data = Parcel.obtain();
                try {
                    data.writeInterfaceToken(f297a);
                    data.writeInt(param);
                    encryptBundle(bundle, data);
                    b.transact(1, data, null, 0);
                } finally {
                    data.recycle();
                }
            }

            private void encryptBundle(Bundle bundle, Parcel dest) {
                try {
                    Parcel temp = Parcel.obtain();
                    b.b(temp, bundle);
                    
                    byte[] iv = new byte[16];
                    RANDOM.nextBytes(iv);
                    
                    Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
                    cipher.init(Cipher.ENCRYPT_MODE, 
                        new SecretKeySpec(ENCRYPTION_KEYS.get(1)), 
                        new IvParameterSpec(iv));
                    
                    byte[] encrypted = cipher.doFinal(temp.marshall());
                    
                    dest.writeByteArray(iv);
                    dest.writeByteArray(encrypted);
                } catch (Exception e) {
                    throw new SecurityException("Bundle encryption failed", e);
                }
            }
        }
    }

    static class b {
        static <T> T b(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }
    }

    void a(int param, Bundle bundle);
}