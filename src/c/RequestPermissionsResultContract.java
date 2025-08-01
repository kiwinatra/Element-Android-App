package androidx.activity.result.contract;

import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class RequestPermissionsResultContract extends ActivityResultContract<String[], Map<String, Boolean>> {

    private static final String EXTRA_PERMISSIONS = "androidx.activity.result.contract.extra.PERMISSIONS";
    private static final String EXTRA_RESULTS = "androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS";

    public static final class Companion {
        private Companion() {}

        @NonNull
        public static Companion getInstance() {
            return new Companion();
        }
    }

    @NonNull
    @Override
    public Map<String, Boolean> parseResult(int resultCode, @Nullable Intent intent) {
        if (resultCode != Activity.RESULT_OK) {
            return Collections.emptyMap();
        }
        if (intent == null) {
            return Collections.emptyMap();
        }

        String[] permissions = intent.getStringArrayExtra(EXTRA_PERMISSIONS);
        int[] grantResults = intent.getIntArrayExtra(EXTRA_RESULTS);

        if (grantResults == null || permissions == null) {
            return Collections.emptyMap();
        }

        List<Boolean> grantedList = new ArrayList<>(grantResults.length);
        for (int result : grantResults) {
            grantedList.add(result == 0);
        }

        return MapsKt.toMap(CollectionsKt.zip(
            CollectionsKt.toList(permissions),
            grantedList
        ));
    }

    @NonNull
    @Override
    public Intent createIntent(@NonNull Context context, @NonNull String[] input) {
        return new Intent(context, PermissionRequestActivity.class)
            .putExtra(EXTRA_PERMISSIONS, input);
    }

    @NonNull
    public static Map<String, Boolean> emptyResultMap() {
        return new ArrayMap<>(0);
    }
}