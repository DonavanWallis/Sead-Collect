package org.sead.collect.android.injection.config;

import android.app.Application;
import android.telephony.SmsManager;

import org.javarosa.core.reference.ReferenceManager;
import org.sead.collect.android.activities.FormDownloadList;
import org.sead.collect.android.activities.FormEntryActivity;
import org.sead.collect.android.activities.FormMapActivity;
import org.sead.collect.android.activities.GeoPointMapActivity;
import org.sead.collect.android.activities.GeoPolyActivity;
import org.sead.collect.android.activities.GoogleDriveActivity;
import org.sead.collect.android.activities.GoogleSheetsUploaderActivity;
import org.sead.collect.android.activities.InstanceUploaderListActivity;
import org.sead.collect.android.activities.MainMenuActivity;
import org.sead.collect.android.adapters.InstanceUploaderAdapter;
import org.sead.collect.android.analytics.Analytics;
import org.sead.collect.android.application.Collect;
import org.sead.collect.android.events.RxEventBus;
import org.sead.collect.android.formentry.ODKView;
import org.sead.collect.android.fragments.DataManagerList;
import org.sead.collect.android.geo.GoogleMapFragment;
import org.sead.collect.android.geo.MapboxMapFragment;
import org.sead.collect.android.geo.OsmDroidMapFragment;
import org.sead.collect.android.fragments.ShowQRCodeFragment;
import org.sead.collect.android.logic.PropertyManager;
import org.sead.collect.android.openrosa.OpenRosaHttpInterface;
import org.sead.collect.android.preferences.AdminSharedPreferences;
import org.sead.collect.android.preferences.FormMetadataFragment;
import org.sead.collect.android.preferences.GeneralSharedPreferences;
import org.sead.collect.android.preferences.ServerPreferencesFragment;
import org.sead.collect.android.storage.migration.StorageMigrationDialog;
import org.sead.collect.android.storage.migration.StorageMigrationService;
import org.sead.collect.android.tasks.InstanceServerUploaderTask;
import org.sead.collect.android.tasks.ServerPollingJob;
import org.sead.collect.android.tasks.sms.SmsNotificationReceiver;
import org.sead.collect.android.tasks.sms.SmsSender;
import org.sead.collect.android.tasks.sms.SmsSentBroadcastReceiver;
import org.sead.collect.android.tasks.sms.SmsService;
import org.sead.collect.android.tasks.sms.contracts.SmsSubmissionManagerContract;
import org.sead.collect.android.upload.AutoSendWorker;
import org.sead.collect.android.utilities.AuthDialogUtility;
import org.sead.collect.android.utilities.FormDownloader;
import org.sead.collect.android.widgets.ExStringWidget;
import org.sead.collect.android.widgets.QuestionWidget;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;

/**
 * Dagger component for the application. Should include
 * application level Dagger Modules and be built with Application
 * object.
 *
 * Add an `inject(MyClass myClass)` method here for objects you want
 * to inject into so Dagger knows to wire it up.
 *
 * Annotated with @Singleton so modules can include @Singletons that will
 * be retained at an application level (as this an instance of this components
 * is owned by the Application object).
 *
 * If you need to call a provider directly from the component (in a test
 * for example) you can add a method with the type you are looking to fetch
 * (`MyType myType()`) to this interface.
 *
 * To read more about Dagger visit: https://google.github.io/dagger/users-guide
 **/

@Singleton
@Component(modules = {
        AppDependencyModule.class
})
public interface AppDependencyComponent {

    @Component.Builder
    interface Builder {

        @BindsInstance
        Builder application(Application application);

        Builder appDependencyModule(AppDependencyModule testDependencyModule);

        AppDependencyComponent build();
    }

    void inject(Collect collect);

    void inject(SmsService smsService);

    void inject(SmsSender smsSender);

    void inject(SmsSentBroadcastReceiver smsSentBroadcastReceiver);

    void inject(SmsNotificationReceiver smsNotificationReceiver);

    void inject(InstanceUploaderAdapter instanceUploaderAdapter);

    void inject(DataManagerList dataManagerList);

    void inject(PropertyManager propertyManager);

    void inject(FormEntryActivity formEntryActivity);

    void inject(InstanceServerUploaderTask uploader);

    void inject(ServerPreferencesFragment serverPreferencesFragment);

    void inject(FormDownloader formDownloader);

    void inject(ServerPollingJob serverPollingJob);

    void inject(AuthDialogUtility authDialogUtility);

    void inject(FormDownloadList formDownloadList);

    void inject(InstanceUploaderListActivity activity);

    void inject(GoogleDriveActivity googleDriveActivity);

    void inject(GoogleSheetsUploaderActivity googleSheetsUploaderActivity);

    void inject(QuestionWidget questionWidget);

    void inject(ExStringWidget exStringWidget);

    void inject(ODKView odkView);

    void inject(FormMetadataFragment formMetadataFragment);

    void inject(GeoPointMapActivity geoMapActivity);

    void inject(GeoPolyActivity geoPolyActivity);

    void inject(FormMapActivity formMapActivity);

    void inject(OsmDroidMapFragment mapFragment);

    void inject(GoogleMapFragment mapFragment);

    void inject(MapboxMapFragment mapFragment);

    void inject(MainMenuActivity mainMenuActivity);

    void inject(ShowQRCodeFragment showQRCodeFragment);

    void inject(StorageMigrationService storageMigrationService);

    void inject(AutoSendWorker autoSendWorker);

    void inject(StorageMigrationDialog storageMigrationDialog);

    SmsManager smsManager();

    SmsSubmissionManagerContract smsSubmissionManagerContract();

    RxEventBus rxEventBus();

    OpenRosaHttpInterface openRosaHttpInterface();

    ReferenceManager referenceManager();

    Analytics analytics();

    GeneralSharedPreferences generalSharedPreferences();

    AdminSharedPreferences adminSharedPreferences();
}
