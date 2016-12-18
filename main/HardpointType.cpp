#include "HardpointType.h"

enum class HardpointType::HardpointEnum {
    BALLISTIC, ENERGY, MISSILE, AMS, ECM, MASC
};

HardpointType::HardpointType(const HardpointType::HardpointEnum & techBase, const std::string & fullName, const std::string & abbreviation)
    :longName(fullName), shortName(abbreviation), enumId(techBase) {
}

const HardpointType HardpointType::BALLISTIC(HardpointType::HardpointEnum::BALLISTIC, "Ballistic", "B");
const HardpointType HardpointType::ENERGY(HardpointType::HardpointEnum::ENERGY, "Energy", "En");
const HardpointType HardpointType::MISSILE(HardpointType::HardpointEnum::MISSILE, "Missile", "Mi");
const HardpointType HardpointType::AMS(HardpointType::HardpointEnum::AMS, "AMS", "A");
const HardpointType HardpointType::ECM(HardpointType::HardpointEnum::ECM, "ECM", "Ec");
const HardpointType HardpointType::MASC(HardpointType::HardpointEnum::MASC, "MASC", "Ma");
