package nl.enjarai.doabarrelroll.compat.yacl;

import nl.enjarai.doabarrelroll.config.ModConfigServer;

public class MutableConfigServer {
    public boolean allowThrusting;
    public boolean forceEnabled;
    public boolean forceInstalled;
    public int installedTimeout;

    public MutableConfigServer(ModConfigServer config) {
        this.allowThrusting = config.allowThrusting();
        this.forceEnabled = config.forceEnabled();
        this.forceInstalled = config.forceInstalled();
        this.installedTimeout = config.installedTimeout();
    }

    public ModConfigServer toImmutable() {
        return new ModConfigServer(this.allowThrusting, this.forceEnabled, this.forceInstalled, this.installedTimeout);
    }
}
