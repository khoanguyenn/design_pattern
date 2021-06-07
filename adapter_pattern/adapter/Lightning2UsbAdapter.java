package adapter_pattern.adapter;

import adapter_pattern.LightningPhone;
import adapter_pattern.MicroUsbPhone;

/* exposing the target interface while wrapping source object */
public class Lightning2UsbAdapter implements MicroUsbPhone {
    private final LightningPhone lightningPhone;

    public Lightning2UsbAdapter(LightningPhone lightningPhone) {
        this.lightningPhone = lightningPhone;
    }

    @Override
    public void useMicroUsb() {
        System.out.println("MicroUsb connected");
        lightningPhone.useLightning();
    }

    @Override
    public void recharge() {
        lightningPhone.recharge();
    }
}
