#ifndef MOTIVETYPE_H
#define MOTIVETYPE_H

#include "memory"
#include "vector"

#include "SectionType.h"

class MotiveType
{
public:
    static const MotiveType BIPED;
    static const MotiveType QUAD;

private:
    enum class MotiveEnum;

    const MotiveEnum motiveId;
    const std::vector<SectionType> typeSections;

    MotiveType(const MotiveEnum & motiveType, std::vector<SectionType> sections);
};

#endif // MOTIVETYPE_H
