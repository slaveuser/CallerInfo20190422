package org.xdty.callerinfo.plugin;

import org.xdty.callerinfo.plugin.IPluginServiceCallback;

interface IPluginService {
    void checkCallPermission();
    void checkCallLogPermission();
    void hangUpPhoneCall();
    void updateCallLog(String number, String name);
    void registerCallback(IPluginServiceCallback callback);
    String exportData(String data);
    String importData();
    void checkStoragePermission();
    void setIconStatus(boolean enabled);
}
