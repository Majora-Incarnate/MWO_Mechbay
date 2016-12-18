#include "WeightClass.h"

enum class WeightClass::WeightEnum {
    ASSAULT, HEAVY, MEDIUM, SMALL
};

WeightClass::WeightClass(const WeightClass::WeightEnum & weightClass, const std::string & fullName, const int & minimum, const int & maximum)
    :name(fullName), minimumWeight(minimum), maximumWeight(minimum), enumId(weightClass) {
}

const WeightClass WeightClass::ASSAULT(WeightClass::WeightEnum::ASSAULT, "Assault", 80, 100);
const WeightClass WeightClass::HEAVY(WeightClass::WeightEnum::HEAVY, "Heavy", 60, 75);
const WeightClass WeightClass::MEDIUM(WeightClass::WeightEnum::MEDIUM, "Medium", 40, 55);
const WeightClass WeightClass::SMALL(WeightClass::WeightEnum::SMALL, "Small", 20, 35);
