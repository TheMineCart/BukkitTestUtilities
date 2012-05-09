package tmc.BukkitTestUtilities.Mocks;// Created by cyrus on 5/9/12 at 2:00 PM

import org.junit.Before;
import org.junit.Test;

import static com.google.common.collect.Lists.newArrayList;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;
import static org.junit.Assert.assertThat;
import static org.junit.internal.matchers.IsCollectionContaining.hasItem;

public class TestServerTest {
    private TestServer server;

    @Before
    public void setUp() {
        server = new TestServer();
    }

    @Test
    public void shouldAddPlayerToOnlinePlayers() {
        assertThat(server.getOnlinePlayers().length, is(0) );
        TestPlayer jason = new TestPlayer("Jason");
        server.addOnlinePlayer(jason);

        assertThat(server.getOnlinePlayers().length, is(1));
        assertThat(server.getOnlinePlayers()[0].getName(), is("Jason"));
    }

    @Test
    public void shouldGetPlayerByNameFromOnlinePlayers() {
        TestPlayer jason = new TestPlayer("Jason");
        server.addOnlinePlayer(jason);

        assertThat((TestPlayer) server.getPlayer("Jason"), is(jason));
        assertThat((TestPlayer) server.getPlayerExact("Jason"), is(jason));
    }

    @Test
    public void shouldGetNullIfPlayerNotOnline() {
        assertThat(server.getPlayer("Jason"), nullValue());
        assertThat(server.getPlayerExact("Jason"), nullValue());
    }
}
