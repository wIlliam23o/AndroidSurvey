package org.adaptlab.chpir.android.survey.Models;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;

@RunWith(RobolectricTestRunner.class)
public class InstrumentTest {
	private static final Long REMOTE_ID = 12382903L;
	private static final String TITLE = "myTitle";
	private Instrument instrument;

	@Before
	public void setUp() {
		instrument = new Instrument();
	}

	@Test
	public void shouldReturnRemoteId() throws Exception {
		instrument.setRemoteId(REMOTE_ID);
		assertThat(instrument.getRemoteId(), equalTo(REMOTE_ID));
	}

	@Test
	public void shouldReturnTitle() throws Exception {
		instrument.setTitle(TITLE);
		assertThat(instrument.getTitle(), equalTo(TITLE));
	}
	
	@Test 
	//TODO: 
	/* Look here: 
	 * http://eclipsesource.com/blogs/2012/06/15/serious-unit-testing-on-android/
	 * http://grepcode.com/file/repo1.maven.org/maven2/org.robolectric/robolectric/2.1.1/org/robolectric/shadows/ShadowTypeface.java#ShadowTypeface
	*/
	public void shouldReturnTypeFace() throws Exception {
		//assertThat(instrument.getTypeFace(Robolectric.application), equalTo(Typeface.DEFAULT));
	}

}