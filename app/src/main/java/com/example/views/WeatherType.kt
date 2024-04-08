package com.example.views

import androidx.annotation.DrawableRes

sealed class WeatherType(
    val weatherDescription: String,
    @DrawableRes val icon: Int
) {
    object ClearSky : WeatherType(
        weatherDescription = "Clear sky",
        icon = R.drawable.ic_sunny
    )

    object MainlyClear : WeatherType(
        weatherDescription = "Mainly clear",
        icon = R.drawable.ic_sunnycloudy
    )

    object PartlyCloudy : WeatherType(
        weatherDescription = "Partly cloudy",
        icon = R.drawable.ic_sunnycloudy
    )

    object Overcast : WeatherType(
        weatherDescription = "Overcast",
        icon = R.drawable.ic_very_cloudy
    )

    object Foggy : WeatherType(
        weatherDescription = "Foggy",
        icon = R.drawable.ic_pressure
    )

    object DepositingRimeFog : WeatherType(
        weatherDescription = "Depositing rime fog",
        icon = R.drawable.ic_pressure
    )

    object LightDrizzle : WeatherType(
        weatherDescription = "Light drizzle",
        icon = R.drawable.ic_rainshower
    )

    object ModerateDrizzle : WeatherType (
        weatherDescription = "Moderate drizzle",
        icon = R.drawable.ic_rainshower
    )

    object DenseDrizzle : WeatherType (
        weatherDescription = "Dense drizzle",
        icon = R.drawable.ic_rainshower
    )

    object LightFreezingDrizzle : WeatherType (
        weatherDescription = "Light freezing drizzle",
        icon = R.drawable.ic_snowyrainy
    )

    object DenseFreezingDrizzle : WeatherType (
        weatherDescription = "Dense freezing drizzle",
        icon = R.drawable.ic_snowyrainy
    )

    object SlightRain : WeatherType (
        weatherDescription = "Slight rain",
        icon = R.drawable.ic_rainy
    )

    object ModerateRain : WeatherType (
        weatherDescription = "Moderate rain",
        icon = R.drawable.ic_rainy
    )

    object HeavyRain : WeatherType (
        weatherDescription = "Heavy rain",
        icon = R.drawable.ic_rainy
    )

    object HeavyFreezingRain : WeatherType (
        weatherDescription = "Heavy freezing rain",
        icon = R.drawable.ic_snowyrainy
    )

    object SlightSnowFall : WeatherType (
        weatherDescription = "Slight snow fall",
        icon = R.drawable.ic_snowy
    )

    object ModerateSnowFall : WeatherType (
        weatherDescription = "Moderate snow fall",
        icon = R.drawable.ic_heavysnow
    )

    object HeavySnowFall : WeatherType (
        weatherDescription = "Heavy snow fall",
        icon = R.drawable.ic_heavysnow
    )

    object SnowGrains : WeatherType (
        weatherDescription = "Snow grains",
        icon = R.drawable.ic_heavysnow
    )

    object SlightRainShowers : WeatherType (
        weatherDescription = "Slight rain showers",
        icon = R.drawable.ic_rainshower
    )

    object ModerateRainShowers : WeatherType (
        weatherDescription = "Moderate rain showers",
        icon = R.drawable.ic_rainy
    )

    object ViolentRainShowers : WeatherType (
        weatherDescription = "Violent rain showers",
        icon = R.drawable.ic_rainy
    )

    object SlightSnowShowers : WeatherType (
        weatherDescription = "Slight snow showers",
        icon = R.drawable.ic_snowy
    )

    object HeavySnowShowers : WeatherType (
        weatherDescription = "Heavy snow showers",
        icon = R.drawable.ic_heavysnow
    )

    object ModerateThunderstorm : WeatherType (
        weatherDescription = "Moderate thunderstorm",
        icon = R.drawable.ic_rainythunder
    )

    object SlightHailThunderstorm : WeatherType (
        weatherDescription = "Slight hail thunderstorm",
        icon = R.drawable.ic_rainythunder
    )

    object HeavyHailThunderstorm : WeatherType (
        weatherDescription = "Heavy hail thunderstorm",
        icon = R.drawable.ic_rainythunder
    )

    companion object {
        fun fromWMO(code: Int): WeatherType {
            return when(code) {
                0 -> ClearSky
                1 -> MainlyClear
                2 -> PartlyCloudy
                3 -> Overcast
                45 -> Foggy
                48 -> DepositingRimeFog
                51 -> LightDrizzle
                53 -> ModerateDrizzle
                55 -> DenseDrizzle
                56 -> LightFreezingDrizzle
                57 -> DenseFreezingDrizzle
                61 -> SlightRain
                63 -> ModerateRain
                65 -> HeavyRain
                66 -> LightFreezingDrizzle
                67 -> HeavyFreezingRain
                71 -> SlightSnowFall
                73 -> ModerateSnowFall
                75 -> HeavySnowFall
                77 -> SnowGrains
                80 -> SlightRainShowers
                81 -> ModerateRainShowers
                82 -> ViolentRainShowers
                85 -> SlightSnowShowers
                86 -> HeavySnowShowers
                95 -> ModerateThunderstorm
                96 -> SlightHailThunderstorm
                99 -> HeavyHailThunderstorm
                else -> ClearSky
            }
        }
    }
}