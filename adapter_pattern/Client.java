package adapter_pattern;

import adapter_pattern.adapter.Lightning2UsbAdapter;
import adapter_pattern.adapter.MicroUsb2LightningAdapter;
import adapter_pattern.phone.Android;
import adapter_pattern.phone.Iphone;
import adapter_pattern.phone.Huawei;

public class Client {
    static void rechargeMicroUsbPhone(MicroUsbPhone phone) {
        phone.useMicroUsb();
        phone.recharge();
    }

    static void rechargeLightningPhone(LightningPhone phone) {
        phone.useLightning();
        phone.recharge();
    }

    public static void main(String[] args) {
        Android android = new Android();
        Iphone iPhone = new Iphone();
        // Huawei huawei = new Huawei();

        //Recharge micro USB phone, for the android type 
        rechargeMicroUsbPhone(android);

        //Recharge iPhone type
        rechargeLightningPhone(iPhone);

        // rechargeMicroUsbPhone(huawei);

        //However if we want to charge iPhone with micro USB, we have to plugin the adapter between them
        rechargeMicroUsbPhone(new Lightning2UsbAdapter(iPhone));

        //Vice versa, use the MicroUSB -> Lightning adapter to recharge the MicroUSB phone 
        rechargeLightningPhone(new MicroUsb2LightningAdapter(android));
    }

}
