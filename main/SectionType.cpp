#include "SectionType.h"

enum class SectionType::SectionEnum {
    HEAD, CENTER_TORSO, RIGHT_TORSO, LEFT_TORSO, REAR_CENTER_TORSO, REAR_RIGHT_TORSO, REAR_LEFT_TORSO, RIGHT_ARM, LEFT_ARM, RIGHT_LEG,
    LEFT_LEG, FRONT_RIGHT_LEG, FRONT_LEFT_LEG, REAR_RIGHT_LEG, REAR_LEFT_LEG, SPECIAL_1, SPECIAL_2
};

SectionType::SectionType(const SectionType::SectionEnum & sectionType, const std::string & fullName, const std::string & abbreviation)
    :longName(fullName), shortName(abbreviation), enumId(sectionType) {
}

const SectionType SectionType::HEAD(SectionType::SectionEnum::HEAD, "Head", "HD");
const SectionType SectionType::CENTER_TORSO(SectionType::SectionEnum::CENTER_TORSO, "Head", "CT");
const SectionType SectionType::RIGHT_TORSO(SectionType::SectionEnum::RIGHT_TORSO, "Head", "RT");
const SectionType SectionType::LEFT_TORSO(SectionType::SectionEnum::LEFT_TORSO, "Head", "LT");
const SectionType SectionType::REAR_CENTER_TORSO(SectionType::SectionEnum::REAR_CENTER_TORSO, "Head", "RCT");
const SectionType SectionType::REAR_RIGHT_TORSO(SectionType::SectionEnum::REAR_RIGHT_TORSO, "Head", "RRT");
const SectionType SectionType::REAR_LEFT_TORSO(SectionType::SectionEnum::REAR_LEFT_TORSO, "Head", "RLT");
const SectionType SectionType::RIGHT_ARM(SectionType::SectionEnum::RIGHT_ARM, "Head", "RA");
const SectionType SectionType::LEFT_ARM(SectionType::SectionEnum::LEFT_ARM, "Head", "LA");
const SectionType SectionType::RIGHT_LEG(SectionType::SectionEnum::RIGHT_LEG, "Head", "RL");
const SectionType SectionType::LEFT_LEG(SectionType::SectionEnum::LEFT_LEG, "Head", "LL");
const SectionType SectionType::FRONT_RIGHT_LEG(SectionType::SectionEnum::FRONT_RIGHT_LEG, "Head", "FRL");
const SectionType SectionType::FRONT_LEFT_LEG(SectionType::SectionEnum::FRONT_LEFT_LEG, "Head", "FLL");
const SectionType SectionType::REAR_RIGHT_LEG(SectionType::SectionEnum::REAR_RIGHT_LEG, "Head", "RRL");
const SectionType SectionType::REAR_LEFT_LEG(SectionType::SectionEnum::REAR_LEFT_LEG, "Head", "RLL");
const SectionType SectionType::SPECIAL_1(SectionType::SectionEnum::SPECIAL_1, "Head", "S1");
const SectionType SectionType::SPECIAL_2(SectionType::SectionEnum::SPECIAL_2, "Head", "S2");
