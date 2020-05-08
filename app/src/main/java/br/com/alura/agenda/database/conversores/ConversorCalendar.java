package br.com.alura.agenda.database.conversores;

import android.arch.persistence.room.TypeConverter;

import java.util.Calendar;


public class ConversorCalendar {

    @TypeConverter
    public long paraLong(Calendar calendar){
        return calendar.getTimeInMillis();
    }

    @TypeConverter
    public Calendar paraCalendar(Long timeMillis){
        Calendar momento = Calendar.getInstance();
        if(timeMillis != null) {
            momento.setTimeInMillis(timeMillis);
        }
        return momento;
    }
}
