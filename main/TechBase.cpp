#include "TechBase.h"

enum class TechBase::TechEnum {
    UNIVERSAL, INNER_SPHERE, CLAN
};

TechBase::TechBase(const TechBase::TechEnum & techBase, const std::string & fullName, const std::string & abbreviation)
    :longName(fullName), shortName(abbreviation), enumId(techBase) {
}

const TechBase TechBase::UNIVERSAL(TechBase::TechEnum::UNIVERSAL, "Universal", "U");
const TechBase TechBase::INNER_SPHERE(TechBase::TechEnum::INNER_SPHERE, "Inner Sphere", "IS");
const TechBase TechBase::CLAN(TechBase::TechEnum::CLAN, "Clan", "CL");
