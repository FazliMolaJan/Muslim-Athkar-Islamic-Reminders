package net.a6te.lazycoder.muslim_pro_islamicremainders.MVP;

import android.hardware.SensorManager;
import android.view.LayoutInflater;
import android.view.View;

import net.a6te.lazycoder.muslim_pro_islamicremainders.model.Surah;

import java.io.File;
import java.util.ArrayList;

public interface MVPPresenter {

    interface HomePresenter{
        void createBitMap(View view);

        void createIntentToShareImage(File filePath);

        void initializeRemainder();

        void prepareAtkhar();

        void prepareAtkharBtnPress();
    }
    interface PrayerTimePresenter{
        void startCalculationPrayerTime();
    }
    interface QiblaPresenter{
        void startCalculatingLocation();

        boolean checkSensorAvailability(SensorManager mSensorManager);

        void calculateQiblaInfo();

        void onResume();

        void onPause();
    }

    interface QuranPresenter{
        void prepareSearchAdapter(LayoutInflater inflater, ArrayList<Surah> surahs);
    }
    interface SettingsPresenter{

        void prepareAdapters();

        void saveAppLanguageId(int id);

        void saveFrequencyId(int id);

        void saveCalculationMethodId(int id);

        void saveJuristicMethodId(int id);

        void saveSelectedRemainderLanguage(boolean[] selectedLanguage);
    }
}
