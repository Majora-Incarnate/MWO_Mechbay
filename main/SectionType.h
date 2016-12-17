#ifndef SECTIONTYPE_H
#define SECTIONTYPE_H

#include "string"

class SectionType
{
public:
    static const SectionType HEAD;
    static const SectionType CENTER_TORSO;
    static const SectionType RIGHT_TORSO;
    static const SectionType LEFT_TORSO;
    static const SectionType REAR_CENTER_TORSO;
    static const SectionType REAR_RIGHT_TORSO;
    static const SectionType REAR_LEFT_TORSO;
    static const SectionType RIGHT_ARM;
    static const SectionType LEFT_ARM;
    static const SectionType RIGHT_LEG;
    static const SectionType LEFT_LEG;
    static const SectionType FRONT_RIGHT_LEG;
    static const SectionType FRONT_LEFT_LEG;
    static const SectionType REAR_RIGHT_LEG;
    static const SectionType REAR_LEFT_LEG;
    static const SectionType SPECIAL_1;
    static const SectionType SPECIAL_2;

    const std::string longName;
    const std::string shortName;

private:
    enum class SectionEnum;

    const SectionEnum enumId;

    SectionType(const SectionEnum sectionType, const std::string fullName, const std::string abbreviation);
};

#endif // SECTIONTYPE_H
