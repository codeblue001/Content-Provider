package jide.delano.contentprovider;

import android.net.Uri;

public final class Contract {

    private Contract() {}

    public static final String AUTHORITY = "jide.delano.contentprovider.provider";
    public static final String CONTENT_PATH = "words";
    public static final Uri CONTENT_URI = Uri.parse("content://" + AUTHORITY + "/" + CONTENT_PATH);
    static final int ALL_ITEMS = -2;
    static final String WORD_ID = "id";
    static final String SINGLE_RECORD_MIME_TYPE = "vnd.android.cursor.item/vnd.jide.delano.contentprovider.words";
    static final String MULTIPLE_RECORDS_MIME_TYPE = "vnd.android.cursor.dir/vnd.com.example.provider.words";

}
