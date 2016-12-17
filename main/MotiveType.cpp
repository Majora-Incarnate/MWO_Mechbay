#include "MotiveType.h"

enum class MotiveType::MotiveEnum {
    BIPED, QUAD
};

MotiveType::MotiveType(const MotiveEnum motiveType, std::vector<SectionType> sections)
    : motiveId(motiveType), typeSections(sections.data()) {
}

const MotiveType MotiveType::BIPED(MotiveType::MotiveEnum::BIPED, {SectionType::HEAD, SectionType::CENTER_TORSO,
                                   SectionType::RIGHT_TORSO, SectionType::LEFT_TORSO, SectionType::REAR_CENTER_TORSO,
                                   SectionType::REAR_RIGHT_TORSO, SectionType::REAR_LEFT_TORSO, SectionType::RIGHT_ARM,
                                   SectionType::LEFT_ARM, SectionType::RIGHT_LEG, SectionType::LEFT_LEG});

const MotiveType MotiveType::QUAD(MotiveType::MotiveEnum::QUAD, {SectionType::HEAD, SectionType::CENTER_TORSO,
                                  SectionType::RIGHT_TORSO, SectionType::LEFT_TORSO, SectionType::REAR_CENTER_TORSO,
                                  SectionType::REAR_RIGHT_TORSO, SectionType::REAR_LEFT_TORSO, SectionType::FRONT_RIGHT_LEG,
                                  SectionType::FRONT_LEFT_LEG, SectionType::REAR_RIGHT_LEG, SectionType::REAR_LEFT_LEG});
